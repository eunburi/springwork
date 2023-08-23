package aaa.model;

import lombok.Data;

@Data //그냥쓸려고 특별한거 없음
public class Battery {

	String name;
	int size;
	
	public Battery(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	
	
	
	
	
}
