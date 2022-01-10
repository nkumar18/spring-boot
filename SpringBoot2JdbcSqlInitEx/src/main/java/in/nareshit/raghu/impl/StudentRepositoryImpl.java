package in.nareshit.raghu.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Student;
import in.nareshit.raghu.repo.StudentRepository;

@Component
public class StudentRepositoryImpl implements StudentRepository {
    
	@Autowired
	private JdbcTemplate jt;//HAS-A
	
	@Override
	public int saveStudent(Student s) {
		// TODO Auto-generated method stub
		String sql="Insert into student values(?,?,?)";
		
		int count=jt.update(sql,s.getStdId(),s.getStdName(),s.getStdFee());
		return count;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		String sql="select * from student";
		List<Student> list=jt.query(sql,(rs,count)->new Student(rs.getInt("SID"),
				                                      rs.getString("SNAME"),
				                                      rs.getDouble("SFEE")
				                                      ));
		return list;
	}

	@Override
	public Student getOneStudentById(Integer id) {
		// TODO Auto-generated method stub
		String sql="select * from student where sid=?";
		Student student=jt.queryForObject(sql, (rs,count)-> new Student(
				rs.getInt("SID"),
				rs.getString("SNAME"),
				rs.getDouble("SFEE")),id);
		
		return student;
	}

	@Override
	public int updateStudent(Student s) {
		// TODO Auto-generated method stub
		
		String sql="update student set sname=?,sfee=? where sid=?";
		int count=jt.update(sql, s.getStdName(),s.getStdFee(),s.getStdId());
		return count;
	}

	@Override
	public int deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		String sql="delete from student where sid=?";
		int count=jt.update(sql, id);
		
		return count;
	}
	
	
	

}
