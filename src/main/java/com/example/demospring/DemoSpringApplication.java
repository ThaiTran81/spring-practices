package com.example.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DemoSpringApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
//		SpringApplication.run(DemoSpringApplication.class, args);

		var context = new AnnotationConfigApplicationContext(TestBean.class);
//		var context1 = new AnnotationConfigApplicationContext(Vehicle.class);

		Vehicle vehicle = context.getBean(Vehicle.class);
		Person person = context.getBean(Person.class);
//		Vehicle vehicle1 = context1.getBean(Vehicle.class);
//		context.getBean("byeCustom", String.class);

//		vehicle1.setName("Ferrari");
//		vehicle.setName("Honda");
		person.getVehicle().setName("Ferrari");
		System.out.println(vehicle.getName());
		System.out.println(person.getVehicle().getName());

	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
	}
}
