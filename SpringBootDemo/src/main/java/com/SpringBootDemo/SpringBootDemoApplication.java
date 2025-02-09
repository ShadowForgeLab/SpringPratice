package com.SpringBootDemo;

import com.SpringBootDemo.model.Alien;
import com.SpringBootDemo.model.Laptop;
import com.SpringBootDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=  SpringApplication.run(SpringBootDemoApplication.class, args);


		LaptopService service=context.getBean(LaptopService.class);
		Laptop lap=context.getBean(Laptop.class);

		service.addLaptop(lap);
//		Alien obj=context.getBean(Alien.class);
//		System.out.println(obj.getAge());
//		obj.code();



	}

}
