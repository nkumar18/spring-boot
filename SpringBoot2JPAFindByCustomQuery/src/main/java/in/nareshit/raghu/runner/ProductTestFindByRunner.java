package in.nareshit.raghu.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.repo.ProductRepository;
import in.nareshit.raghu.repo.ProductRepository.MyView;

//@Component
public class ProductTestFindByRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		List<MyView>  list =  repo.findByProdIdLessThan(108);
		for(MyView m:list) {
			System.out.println(m.getProdCode()+"-"+m.getProdCost());
			System.out.println(m.getClass().getName());
		}
		
	}

}
