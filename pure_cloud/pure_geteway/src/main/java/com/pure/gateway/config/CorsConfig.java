package com.pure.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @author zmy
 * @version V1.0
 * @since 2021-12-09 17:49:00
 */
@Configuration
public class CorsConfig {

    @Bean
    public CorsWebFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        //是否允许携带cookie
        config.setAllowCredentials(true);
        //可接受的域，是一个具体域名或者*（代表任意域名）
        config.addAllowedOrigin("*");
        //允许携带的头
        config.addAllowedHeader("*");
        //允许访问的方式
        config.addAllowedMethod("*");

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);

        return new CorsWebFilter(source);
    }
}