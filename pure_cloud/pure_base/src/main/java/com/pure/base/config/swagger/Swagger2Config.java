package com.pure.base.config.swagger;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * swagger2
 *
 * @author zmy
 * @version V1.0
 * @since 2021-12-09 11:28:00
 */

@Configuration
@EnableSwagger2WebMvc
public class Swagger2Config {

    @Bean
    public Docket userApiConfig(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("userApi")
                .apiInfo(userApiInfo())
                .select()
                .paths(PathSelectors.regex("/user_info/.*"))
                .build();
    }


    private ApiInfo userApiInfo(){
        return new ApiInfoBuilder()
                .title("后台管理系统API文档")
                .description("本文档描述了后台管理系统的各个模块的接口的调用方式")
                .version("1.0")
                .build();
    }

}
