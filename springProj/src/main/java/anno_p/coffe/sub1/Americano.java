package anno_p.coffe.sub1;

import org.springframework.stereotype.Component;

@Component
public class Americano {
	
	String name = "아메리카노", type="원두,물,가격";
	int price = 5000;
	@Override
	public String toString() {
		return "Americano [name=" + name + ", type=" + type + ", price=" + price + "]";
	}

	
	

	
	

}
