package in.nareshit.raghu.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Product;

@Component
public class TestH2Opr implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate jt;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		String sql= "select * from product";
	jt.query(sql, (rs,count)->new Product(rs.getInt("pid"),
				                              rs.getString("pcode") ,
				                              rs.getDouble("pcost")
				)).forEach(System.out::println);
		


	}
	
	

}
