package in.nareshit.raghu.runner;

import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Product;
import in.nareshit.raghu.repo.ProductRepository;

@Component
public class DataInsertRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		//loading file data
		FileInputStream fis = new FileInputStream("C:\\Users\\eiunmrk\\Pictures\\Capture.PNG");
		//create byte array with size equals to file size
		byte[] prodImg = new byte[fis.available()];
		// load file data into byte[]
		fis.read(prodImg);
		
		//create one lengthy string
		String description ="HELLO ABCDE! welcome to all, sample data, Spring Boot and MS HELLO ABCDE! welcome to all, sample data, Spring Boot and MS";
		// convert String to char[]
		char[] prodDesc = description.toCharArray();
		
		
		repo.save(
				new Product(
						101, 
						"BOOK", 
						500.0, 
						prodImg, 
						prodDesc)
				);

		//close FIS
		fis.close();
		
	}

}
