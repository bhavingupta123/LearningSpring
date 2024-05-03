package org.example;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Laptop {

    private Model model;

    public Laptop(Model model){
        this.model = model;
    }

    public void runLaptop(){
        System.out.println("laptop is running : " +  model.returnModel());
    }
}
