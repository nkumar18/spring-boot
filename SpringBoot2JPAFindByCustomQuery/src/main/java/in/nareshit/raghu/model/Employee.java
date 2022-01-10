package in.nareshit.raghu.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employee")
public class Employee {
	@Id
	private Integer empId;
	private String empName;
	private Double empSal;
	
	@Temporal(TemporalType.DATE)
	private Date dteA; // date 
	@Temporal(TemporalType.TIME)
	private Date dteB; // time
	@Temporal(TemporalType.TIMESTAMP)
	private Date dteC; // date + time
		
	
}