package in.nareshit.raghu.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Book;

@Component
public class BookRowMapper implements RowMapper<Book>{
	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		/*
		 * RowMapper<Book> rowmapper= new BookRowMapper(); Book book= new Book();
		 * book.setBookId(rs.getInt("bid")); book.setBookName(rs.getString("bname"));
		 * book.setBookCost(rs.getDouble("bcost"));
		 */
		 Book book= new Book(
		 rs.getInt("bid"),
		 rs.getString("bname"),
		 rs.getDouble("bcost"));
	return book;
	}

}
