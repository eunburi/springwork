package anno_p.coffe.sub1;

import org.springframework.stereotype.Component;

@Component
public class CaramelMacchiato {
	
	String name = "카라멜마끼아또", type="원두,물,카라멜,가격";
	int price = 6100;
	@Override
	public String toString() {
		return "CaramelMacchiato [name=" + name + ", type=" + type + ", price=" + price + "]";
	}

	

	
	
	

}
