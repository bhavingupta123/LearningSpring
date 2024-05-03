package org.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Model {

    public String returnModel(){
        return "simple";
    }
}
