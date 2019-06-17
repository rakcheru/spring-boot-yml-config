package org.learning.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:database.yml")
public class DatabaseYaml {
  
  @Value("${database.user}")
  private String user;
  
  public String getUser() {
    return user;
  }
  
  @Bean
  public static PropertySourcesPlaceholderConfigurer yaml() {
    return new PropertySourcesPlaceholderConfigurer();
  }
  
}
