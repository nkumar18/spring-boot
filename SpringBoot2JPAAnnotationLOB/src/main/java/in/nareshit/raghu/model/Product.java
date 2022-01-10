package in.nareshit.raghu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="prodtab")
public class Product {
	@Id
	@Column(name="pid")
	private Integer prodId;
	@Column(name="pcode")
	private String prodCode;
	@Column(name="pcost")
	private Double prodCost;
	
	@Lob  // byte[] + @Lob = BLOB
	@Column(name="pimg")
	private byte[] prodImg;
	
	@Lob //char[] + @Lob = CLOB
	@Column(name="pnote")
	private char[] prodDesc;
}
