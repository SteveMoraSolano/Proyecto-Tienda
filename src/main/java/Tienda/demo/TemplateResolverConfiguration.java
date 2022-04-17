
package Tienda.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

@Configuration
public class TemplateResolverConfiguration {
    @Bean
    public SpringResourceTemplateResolver TemplatesResolver_0 (){
    SpringResourceTemplateResolver templateResolver=new SpringResourceTemplateResolver();
templateResolver.setPrefix("classpath:/templates");
templateResolver.setSuffix(".html");
templateResolver.setTemplateMode(TemplateMode.HTML);
templateResolver.setCharacterEncoding("UTF-8");
templateResolver.setOrder(0);
templateResolver.setCheckExistence(true);
return templateResolver;
    }
        @Bean
    public SpringResourceTemplateResolver TemplatesResolver_1 (){
    SpringResourceTemplateResolver templateResolver=new SpringResourceTemplateResolver();
templateResolver.setPrefix("classpath:/templates/categoria");
templateResolver.setSuffix(".html");
templateResolver.setTemplateMode(TemplateMode.HTML);
templateResolver.setCharacterEncoding("UTF-8");
templateResolver.setOrder(0);
templateResolver.setCheckExistence(true);
return templateResolver;
    }
           @Bean
    public SpringResourceTemplateResolver TemplatesResolver_2 (){
    SpringResourceTemplateResolver templateResolver=new SpringResourceTemplateResolver();
templateResolver.setPrefix("classpath:/templates/articulo/");
templateResolver.setSuffix(".html");
templateResolver.setTemplateMode(TemplateMode.HTML);
templateResolver.setCharacterEncoding("UTF-8");
templateResolver.setOrder(0);
templateResolver.setCheckExistence(true);
return templateResolver;
    }
            @Bean
    public SpringResourceTemplateResolver TemplatesResolver_3 (){
    SpringResourceTemplateResolver templateResolver=new SpringResourceTemplateResolver();
templateResolver.setPrefix("classpath:/templates/cliente/");
templateResolver.setSuffix(".html");
templateResolver.setTemplateMode(TemplateMode.HTML);
templateResolver.setCharacterEncoding("UTF-8");
templateResolver.setOrder(0);
templateResolver.setCheckExistence(true);
return templateResolver;
    }
}
