package com.alibaobao.mybatisplus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: admin
 * @Description: swagger配置类
 * @BelongsProject: mybatisplus
 * @BelongsPackage: com.alibaobao.mybatisplus.config
 * @CreateTime: 2021-01-05 11:17:21
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Springboot集成swagger测试")
                .contact(new Contact("Buso","http://blog.com",""))
                .version("v1.0")
                .description("API描述")
                .build();
    }

    @Bean
    public Docket createRESTAPI(Environment environment){
        Profiles of = Profiles.of("dev", "test");
        boolean flag = environment.acceptsProfiles(of);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("artist")
                .enable(flag)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.alibaobao.mybatisplus.generator.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket createRESTAPI1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("docket1");
    }

    @Bean
    public Docket createRESTAPI2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("docket2");
    }

    @Bean
    public Docket createRESTAPI3(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("docket3");
    }

}
