package anno_p;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Qcoffee {
	
	@Autowired
	@Qualifier("mmm2")
		
	Beans be;
	Busock bu;
	String name;
	
	
	
	public void setBe(Beans be) {
		this.be = be;
	}

	public void setBu(Busock bu) {
		this.bu = bu;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Qcoffee [be=" + be + ", bu=" + bu + ", name=" + name + "]";
	}

	
	
	

	
	
	
}


class Beans{
	String name;
	String kind;
	
	@Autowired
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	@Override
	public String toString() {
		return "Beans [name=" + name + ", kind=" + kind + "]";
	}
	
	
	

}

class Busock{
	
	String name;
	String kind;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	@Override
	public String toString() {
		return "Busock [name=" + name + ", kind=" + kind + "]";
	}
	
	
	
	
}