package aop_p.webToon;

import org.springframework.stereotype.Component;

@Component
public class Figure {
		

	public double  circle(int radius, double pi) {
		System.out.println("원 :"+radius+","+pi);
		return 2 * pi * radius;
	}
	
	public String rectangle(int width,int height) {
		System.out.println("사각형 : "+"가로"+width+"세로"+height);
		return "사각형";
	}
	
	public String triangle(int width,int height) {
		System.out.println("사각형 : "+"가로"+width+"세로"+height);
		return "삼각형";
	}

	
}
