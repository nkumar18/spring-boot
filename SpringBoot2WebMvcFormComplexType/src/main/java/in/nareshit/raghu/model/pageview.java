package in.nareshit.raghu.model;

import java.io.File;
import java.util.Date;

import lombok.Data;

@Data
public class pageview {
	
	private String color;
	private File file;
	private Date date;
	private Date time;
	private Date datetimelocal;
	

}
