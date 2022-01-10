package in.nareshit.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.model.Product;

public interface ProductRepository 
	extends JpaRepository<Product, Integer> {
	
	interface MyView {
		//DataType getVariableName();
		String getProdCode();
		Double getProdCost();
	}

	//SQL: select * from product where pid<?
	List<MyView> findByProdIdLessThan(Integer id);
}
