package in.nareshit.raghu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Product;
import in.nareshit.raghu.repo.ProductRepository;

//@Component
public class ProductDataInsertRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		repo.saveAll(Arrays.asList(
				new Product(101, "PEN", 200.0),
				new Product(102, "MOUSE", 500.0),
				new Product(103, "CALC", 600.0),
				new Product(104, "BTL", 350.0),
				new Product(105, "BOOK", 280.0)
				));
	}

}