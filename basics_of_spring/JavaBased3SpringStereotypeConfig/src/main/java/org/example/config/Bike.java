package org.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike {

    private Model model;

    // constructor based autowiring
    @Autowired
    public Bike(Model model){
        System.out.println("bike component created");
        this.model = model;
    }

    public void display(){

        System.out.println("bike here");
        model.useModel();
    }
}
