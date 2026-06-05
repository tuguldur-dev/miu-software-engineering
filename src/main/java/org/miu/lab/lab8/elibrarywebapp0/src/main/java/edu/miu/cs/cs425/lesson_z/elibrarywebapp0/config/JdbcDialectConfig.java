package edu.miu.cs.cs425.lesson_z.elibrarywebapp0.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.relational.core.dialect.Dialect;
import org.springframework.data.relational.core.dialect.AnsiDialect;

@Configuration
public class JdbcDialectConfig {

    @Bean
    public Dialect dialect() {
        return AnsiDialect.INSTANCE;
    }
}