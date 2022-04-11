package com.greedy.lucky.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "me.h9w.lucky")
@EnableJpaRepositories(basePackages = "com.greedy.lucky")
public class JpaConfiguration {
}
