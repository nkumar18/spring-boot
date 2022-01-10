package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstdemowebappApplication implements CommandLineRunner {
	
	@Bean(name="prod")
	public Product getProduct() {
		return new Product();
	}

	public static void main(String[] args) {
		//1.Way to instayiate SpringApplication
	SpringApplication.run(FirstdemowebappApplication.class, args);
		
		//2.Way to instayiate SpringApplication using IOC Contexts
		/*SpringApplication app = new SpringApplication(FirstdemowebappApplication.class);
				app.setBannerMode(Mode.OFF);
				app.run(args);*/
		/*
		 * SpringApplicationBuilder sab=new
		 * SpringApplicationBuilder(FirstdemowebappApplication.class) ; sab.run(args);
		 */
	}
    
	@Autowired
	EmployeeRepo empRepo;
	
	@Override
	public void run(String... args) throws Exception {
		// anything which you want just after initialising container
		System.out.println("After IOC context loaded");

		empRepo.save(new Employee(101, "Ram", 1000));
		empRepo.save(new Employee(102, "shayam", 2000));
		empRepo.save(new Employee(103, "Hari", 3000));
		empRepo.save(new Employee(104, "Govind", 4000));

	}
	


}

class Product{
	
}