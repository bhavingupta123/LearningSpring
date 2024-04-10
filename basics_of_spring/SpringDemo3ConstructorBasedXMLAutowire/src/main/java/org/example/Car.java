package org.example;

public class Car {

    private String name;

    private Model model;


    public String getName() {
        return "car name:" + name + "\nmodel name:" + model.modelName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        System.out.println("hh");
        this.model = model;
    }
}
