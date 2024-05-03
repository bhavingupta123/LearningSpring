package org.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

//    @Autowired // usually not recommended, field injection
    private Model model;

    public Car(){

        System.out.println("car component created");
    }

    public void display(){
        System.out.println("car here");
        model.useModel();
    }

    public Model getModel() {
        return model;
    }

    // setter based injection
    @Autowired
    public void setModel(Model model) {
        this.model = model;
    }
}
