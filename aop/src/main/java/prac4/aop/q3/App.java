package prac4.aop.q3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car c = context.getBean("car", Car.class);
		c.drive();
		Bike b = context.getBean("bike", Bike.class);
		b.ride();
		Airplane a = context.getBean("airplane", Airplane.class);
		a.fly();
	}
}
