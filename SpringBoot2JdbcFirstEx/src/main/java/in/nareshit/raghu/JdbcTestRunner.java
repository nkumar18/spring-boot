package in.nareshit.raghu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcTestRunner implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate jt;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(jt.getClass().getName());
		
		//insert operation
		//String sql="INSERT INTO BOOKS VALUES(?,?,?)";
		
		//Update operation
		
		//String sql="UPDATE BOOKS SET BNAME=?,BCOST=? WHERE BID=?";
		
		//Delete operation
		
		String sql="Delete from BOOKS WHERE BID=?";
		
		//EXECUTE AND GET RESULTS
	    int count=jt.update(sql,11);
	    
	    
	    System.out.println("No of rows affected "+ count);
	    
	    
	    
	    
	    
	    
	    
	  
		
		
	}
	

}
