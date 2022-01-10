package in.nareshit.raghu.repo;

import java.util.List;

import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Student;

public interface StudentRepository {
	
	 int saveStudent(Student s);
	 List<Student> getAllStudent();
     Student getOneStudentById(Integer id);
     int updateStudent(Student s);
 	int deleteStudent(Integer id);


}
