package in.nareshit.raghu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="emptabs")
public class Employee {
	@Id
	@Column(name="eid")
	private Integer empId;
	
	@Column(name="ename")
	private String empName;
	
	@Column(name="esal")
	private Double empSal;
	
	@Column(name="edsg")
	private String empDesg;
	
	@Column(name="edept")
	private String empDept;
}