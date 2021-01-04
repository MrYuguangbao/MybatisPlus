package com.alibaobao.mybatisplus.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: admin
 * @Description: MP配置类
 * @BelongsProject: mybatisplus
 * @BelongsPackage: com.alibaobao.mybatisplus.config
 * @CreateTime: 2021-01-04 22:40:11
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.alibaobao.mybatisplus.mapper") // 此注解也可放在主启动类
public class MybatisPlusConfig {

    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor(){
        return new OptimisticLockerInterceptor();
    }

    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }

    @Bean
    public ISqlInjector iSqlInjector(){
        return new LogicSqlInjector();
    }

    @Bean
    @Profile({"dev","test"})
    public PerformanceInterceptor performanceInterceptor(){
        PerformanceInterceptor interceptor = new PerformanceInterceptor();
        interceptor.setMaxTime(100);
        interceptor.setFormat(true);
        return interceptor;
    }
}
