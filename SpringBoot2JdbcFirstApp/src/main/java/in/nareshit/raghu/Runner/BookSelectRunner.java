package in.nareshit.raghu.Runner;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.mapper.BookRowMapper;
import in.nareshit.raghu.model.Book;


@Component
public class BookSelectRunner implements CommandLineRunner {
	
	@Autowired
	private JdbcTemplate jt;

	

	@Override
   public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
		System.out.println("Inside Select1Runner============================");
		
		 String sql="SELECT * FROM BOOKS";
		 RowMapper<Book> rowmapper= new BookRowMapper();
		 List<Book> bookList=jt.query(sql,rowmapper);
		 
		 //jdk 1.2 Iterator============================
		 
		/*
		 * Iterator<Book> itr=bookList.iterator(); while(itr.hasNext()) { Book book=
		 * itr.next(); System.out.println(book); }
		 */
		 
		 //jdk1.5 -for each============================
		 
		/* for(Book book:bookList) {
			 System.out.println(book);
		 }*/
		 
		 
		 
		//JDK 1.8 forEach method + Lambda Exp===============
		/*
		 * bookList.forEach(book->System.out.println(book));
		 */		 
		
		 //JDK 1.8 forEach method + Method Reference===========
		 
		//list.forEach(System.out::println);
		 
		 List<String> listStr = bookList.stream().filter(ob->ob.getBookCost()>800.0)
			.sorted((ob1,ob2)->ob1.getBookName().compareTo(ob2.getBookName()))
			.map(ob-> "A Book :"+ob.getBookName()+",with Id "+ob.getBookId()+" having cost "+ob.getBookCost())
			.collect(Collectors.toList());
		 listStr.forEach(System.out::println);
		 
		 
		 
		 
		 
		 

		 
	
}
}
