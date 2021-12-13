package com.pure.base.config.redis;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * redis 配置
 * @author zmy
 * @version V1.0
 * @since 2021-08-30 15:38:00
 */
@Getter
@Setter
@ConfigurationProperties(RedisProperties.PREFIX)
public class RedisProperties {

    /**
     * 前缀
     */
    public static final String PREFIX = "prue";

    /**
     * 是否开启Lettuce
     */
    private Boolean enable = true;
}
