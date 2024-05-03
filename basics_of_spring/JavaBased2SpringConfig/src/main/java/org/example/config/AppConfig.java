package org.example.config;

import org.example.Desktop;
import org.example.Laptop;
import org.example.Model;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    public Laptop laptop(Model model){
        return new Laptop(model);
    }

    @Bean
    public Model model(){
        return new Model();
    }
}
