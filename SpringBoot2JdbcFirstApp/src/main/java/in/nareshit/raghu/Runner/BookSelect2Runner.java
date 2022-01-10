package in.nareshit.raghu.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.mapper.BookRowMapper;
import in.nareshit.raghu.model.Book;

@Component
public class BookSelect2Runner implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside Select2Runner============================");
		String sql= "Select * from books where bid<?";
		RowMapper<Book> rowmaper=new BookRowMapper();
		List<Book> booklist = jt.query(sql,
				(rs, rowNum) -> new Book(rs.getInt("bid"), rs.getString("bname"), rs.getDouble("bcost")),12

		);
		//Printing booklist
		//booklist.forEach(book->System.out.println(book));
		booklist.forEach(System.out::println);
		
		String sql1 ="SELECT * FROM BOOKS WHERE BID=?";
		
		Book book=jt.queryForObject(sql1, rowmaper,10);
		System.out.println("Book for id 10" +book);
		
		
		
	}
	
	

}
