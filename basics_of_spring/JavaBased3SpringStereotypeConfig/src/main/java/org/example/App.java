package org.example;

import org.example.config.Bike;
import org.example.config.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("-------------------------------");
        Car car = context.getBean(Car.class);
        car.display();

        System.out.println("-------------------------------");

        Bike bike = context.getBean(Bike.class);
        bike.display();

    }
}
