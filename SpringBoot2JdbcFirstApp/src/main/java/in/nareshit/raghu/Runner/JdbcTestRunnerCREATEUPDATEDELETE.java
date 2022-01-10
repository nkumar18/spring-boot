package in.nareshit.raghu.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class JdbcTestRunnerCREATEUPDATEDELETE implements CommandLineRunner {
	
	
	@Autowired
	private JdbcTemplate jt;

	@Override
   public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
		System.out.println("Inside CreateUpdateDeleteRunner");
		
		//1. INSERT OPERATION
				//String sql = "INSERT INTO BOOKS VALUES(?,?,?)";
				  String sql = "UPDATE BOOKS SET BNAME=?, BCOST=? WHERE BID=?";
				//String sql = "DELETE FROM BOOKS WHERE BID=?";
				
				//2. execute and get result
				int count = jt.update(sql,"SpringBoot",3000.0,13);
			
				
				//3. print result
		
				System.out.println("NO OF ROWS affected!! " + count);


	
}
}
