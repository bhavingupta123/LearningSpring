package org.example;

public class Car {

    private String name;

    private Model model;

    public Car(String name, Model model) {
        System.out.println("car parameterised constructor called");
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return "car name:" + name + "\nmodel name:" + model.modelName();
    }

    public void setName(String name) {
        this.name = name;
    }
}
