import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner scanner = new Scanner(System.in);
        TemperatureConverter converter = context.getBean("factoryMethod",TemperatureConverter.class);
        System.out.println("Enter temperature in Celsius");
        double temp = scanner.nextDouble();
        System.out.println(converter.conversionFromCelsius(temp));
        context.close();
    }
}
