package di_p;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Grade implements BeanNameAware, InitializingBean, DisposableBean{
	String name, type;
	int jum;
	
	public Grade() {
		//System.out.println("Umbrella 생성자");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getJum() {
		return jum;
	}

	public void setJum(int jum) {
		this.jum = jum;
	}

	@Override
	public String toString() {
		return "Grade [name=" + name + ", type=" + type + ", jum=" + jum + "]";
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
