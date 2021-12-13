package com.pure.base.util;

import com.pure.common.exception.CommonErrorEnum;
import com.pure.common.exception.PureException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.CompressionCodecs;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.util.StringUtils;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;

/**
 * jwt工具类
 *
 * @author zmy
 * @version V1.0
 * @since 2021-08-30 11:43:00
 */
public class JwtUtils {

    private static final long TOKEN_EXPIRATION = 24 * 60 * 60 * 1000L;
    private static final String TOKEN_SIGN_KEY = "A1t2g3pure123456";

    private static Key getKeyInstance() {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        byte[] bytes = DatatypeConverter.parseBase64Binary(TOKEN_SIGN_KEY);
        return new SecretKeySpec(bytes, signatureAlgorithm.getJcaName());
    }

    public static String createToken(Long userId, String userName) {
        return Jwts.builder()
                .setSubject("SRB-USER")
                .setExpiration(new Date(System.currentTimeMillis() + TOKEN_EXPIRATION))
                .claim("userId", userId)
                .claim("userName", userName)
                .signWith(SignatureAlgorithm.HS512, getKeyInstance())
                .compressWith(CompressionCodecs.GZIP)
                .compact();
    }

    /**
     * 判断token是否有效
     *
     * @param token token
     * @return 是否有效
     */
    public static boolean checkToken(String token) {
        if (StringUtils.isEmpty(token)) {
            return false;
        }
        try {
            Jwts.parser().setSigningKey(getKeyInstance()).parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Long getUserId(String token) {
        Claims claims = getClaims(token);
        Integer userId = (Integer) claims.get("userId");
        return userId.longValue();
    }

    public static String getUserName(String token) {
        Claims claims = getClaims(token);
        return (String) claims.get("userName");
    }

    public static void removeToken(String token) {
        //jwttoken无需删除，客户端扔掉即可。
    }

    /**
     * 校验token并返回Claims
     *
     * @param token token
     * @return 是否登陆
     */
    private static Claims getClaims(String token) {
        if (StringUtils.isEmpty(token)) {
            // USER_NO_LOGIN("A0106", "用户未登录"),
            throw new PureException(CommonErrorEnum.USER_NO_LOGIN);
        }
        try {
            Jws<Claims> claimsJws = Jwts.parser().setSigningKey(getKeyInstance()).parseClaimsJws(token);
            return claimsJws.getBody();
        } catch (Exception e) {
            throw new PureException(CommonErrorEnum.USER_NO_LOGIN);
        }
    }
}

