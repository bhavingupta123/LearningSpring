package SpringDemo1_CoreSpring.SpringDemo1;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //  XML based config, this is the container
//        Car car = new Car(); old way of creating an object
//        car.run();

        Car obj = (Car) context.getBean("car");
        obj.run();
        System.out.println("model:" + obj.getModel());
    }
}
