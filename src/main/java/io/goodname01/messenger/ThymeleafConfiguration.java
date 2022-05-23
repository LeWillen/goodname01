package io.goodname01.messenger;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import org.thymeleaf.templateresolver.*;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.thymeleaf.templateresolver.FileTemplateResolver;

@Configuration
public class ThymeleafConfiguration {
  @Bean
  public ITemplateResolver defaultTemplateResolver() {
    FileTemplateResolver resolver = new FileTemplateResolver();
    resolver.setSuffix(".html");
    resolver.setPrefix("file:src/main/resources/templates/");
    resolver.setTemplateMode("HTML5");
    resolver.setCharacterEncoding("UTF-8");
    resolver.setCacheable(false);
    return resolver;
  }
}
