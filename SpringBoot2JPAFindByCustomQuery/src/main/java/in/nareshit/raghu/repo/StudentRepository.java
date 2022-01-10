package in.nareshit.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.model.Student;

public interface StudentRepository 
	extends JpaRepository<Student, Integer> {

	//SQL: select * from stdtab where scourse=?
	//findBy<VariableName>(DataType paramName)
	List<Student> findByStdCourse(String course);
	
	//SQL: select * from stdtab where sfee=?
	List<Student> findByStdFee(Double sfee);
	
	//SQL: SELECT *FROM STUDENT WHERE stdId>=?
	//findBy<VariableNameKeyword>(DataType paramName)
	List<Student> findByStdIdGreaterThanEqual(Integer sid);
	
	//SQL: SELECT *FROM STUDENT WHERE stdFee>?
	List<Student>  findByStdFeeGreaterThan(Double sfee);
	
	//SQL: SELECT *FROM STUDENT WHERE stdId between ? and ?
	List<Student> findByStdIdBetween(Integer sid1,Integer sid2);
	
	//SQL: SELECT *FROM STUDENT WHERE stdName IS NULL
	List<Student> findByStdNameIsNull();
	
	//SQL: SELECT *FROM STUDENT WHERE stdName IS NOT NULL
	List<Student> findByStdNameNotNull();
	//List<Student> findByStdNameIsNotNull();
	
	/** Here it is treating like variable name is 'stdNamenotnull'
	 * So Throwing exception
	 */
	// PropertyReferenceException: No property stdNamenotnull found for type Student!
	//List<Student> findBystdNamenotnull();
	
	//SQL: SELECT *FROM STUDENT WHERE stdName Like ?
	List<Student> findByStdNameLike(String input);
	
	//SQL: SELECT *FROM STUDENT WHERE stdName not Like ?
	List<Student> findByStdNameNotLike(String input);
	//------------------------------------------------
		//SQL: select * from stdtab where sid!=? order by sname
		List<Student> findByStdIdNotOrderByStdName(Integer id);
		
		//SQL: select * from stdtab where sid in (...)
		List<Student> findByStdIdIn(List<Integer> ids);
		
		//SQL: select * from stdtab where sid not in (...)
		List<Student> findByStdIdNotIn(List<Integer> ids);
		
		//SQL: select * from stdtab where sid=? or sname=?
		List<Student> findByStdIdOrStdName(Integer sid, String sname);

		//SQL: select * from stdtab where sid>=? and sname like ?
		List<Student> findByStdIdGreaterThanAndStdNameNotLike(Integer sid, String pattern);
		
	
}
