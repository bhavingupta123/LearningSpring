package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Car car = context.getBean("car", Car.class);
//        Car car2 = context.getBean(Car.class); can also do this
        System.out.println(car.getName());
    }
}
