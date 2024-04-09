package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println( "Hello World!" );

        Car car = (Car) context.getBean("car");
        System.out.println(car.getName());
    }
}
