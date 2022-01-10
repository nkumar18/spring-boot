package in.nareshit.raghu.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="emp_tab")
public class Employee {
	
	@Id
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
	private String empName;
	
	@Column(name="eSal")
	private Double empSal;
	
	//collection variables
	
	@ElementCollection
	@CollectionTable( name="emp_prjs_tab", joinColumns = @JoinColumn(name="eid")
	
			)
	@Column(name="proj")	
	private Set<String> empPrjs;
	
	@ElementCollection
	@CollectionTable(name="emp_modules_tab",joinColumns = @JoinColumn(name="eid")
	
			)
	@Column(name="module")
	@OrderColumn(name="pos")
	
	private List<String> empModules;
	
	@ElementCollection                                      //for key(FK)
	@CollectionTable(name="emp_clients_tab",joinColumns = @JoinColumn(name="eid")
	
			)
	@Column(name="cname")//for element
	@MapKeyColumn(name="cindex")//for index
	
	private Map<String,String> empClients; 
	
	
	

}
