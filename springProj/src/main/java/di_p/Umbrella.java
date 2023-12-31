package di_p;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Umbrella implements BeanNameAware, InitializingBean, DisposableBean{
	String name, type;
	int price;
	
	public Umbrella() {
		//System.out.println("Umbrella 생성자");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		//System.out.println("Umbrella setName():"+name);
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
		//System.out.println("Umbrella setPrice():"+price);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Umbrella [name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy()");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet()");
	}
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("setBeanName():"+name);
	}
	
	
}
