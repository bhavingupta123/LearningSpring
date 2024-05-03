package org.example.config;

import org.springframework.stereotype.Component;

@Component
public class Model {

    public Model(){

        System.out.println("model compnent created");
    }

    public void useModel(){
        System.out.println("use this model");
    }
}
