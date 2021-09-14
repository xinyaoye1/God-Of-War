package com.javasm.springboot.config;

import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfig {

@Bean
public ConfigurationCustomizer configurationCustomizer(){
    return new ConfigurationCustomizer() {
        @Override
        public void customize(org.apache.ibatis.session.Configuration configuration) {
            configuration.setLazyLoadingEnabled(true);
            configuration.setMapUnderscoreToCamelCase(true);
            configuration.setLogImpl(Log4jImpl.class);
        }
    };
}

}