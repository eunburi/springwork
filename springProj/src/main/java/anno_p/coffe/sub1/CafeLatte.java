package anno_p.coffe.sub1;

import org.springframework.stereotype.Component;

@Component
public class CafeLatte {
	
	String name = "카페라떼" , type=",물,우유,가격";
	int price = 1200;
	@Override
	public String toString() {
		return "CafeLatte [name=" + name + ", type=" + type + ", price=" + price + "]";
	}

	

	
	
	

}
