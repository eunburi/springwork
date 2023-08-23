package aaa.model;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class SeasonMain { // db에 접속하면 ? db에서 가져올수있음

	HashMap<String, String[]>data;
	
	public SeasonMain() {
		data = new HashMap<>();
		
		data.put("spring","sp1.jpg,sp2.jpg,sp3.jpg".split(","));
		data.put("summer","sua.png,sub.png".split(","));
		data.put("autumn","at_1.jpg,at_2.jpg,at_5.jpg,at_6.jpg".split(","));
		data.put("winter","ww.jpg,ee.jpg,sp1.jpg".split(","));
	}
	
	public String [] getPicture(String title) {
		return data.get(title);
	}
}
