package di_p;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor2 implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		//System.out.println("MyBeanPostProcessor.BeforeInit 실행 : "+beanName+" => "+ bean);
		
		if(bean.getClass().getName().equals("di_p.Grade")) {
			System.out.println(bean+" : RedRedRedRedRedRed");
			Grade gg = (Grade)bean; //bean이라는 객체를 Grade 타입으로 형 변환한다.
									//형 변환한 결과를 gg라는 변수에 할당한다.
			int rjum = gg.getJum();
			int avjum = gg.getJum()/4;
			System.out.println("red점수들 : " + rjum);
			System.out.println("red점수 평균 " + avjum);
			
			if(avjum>90) {
				System.out.println(" red평균 결과 : 수");
			}else if(avjum>80){
				System.out.println(" red평균 결과 : 우");
			}else if(avjum>70){
				System.out.println(" red평균 결과 : 미");
			}else if (avjum>60) {
				System.out.println(" red평균 결과 : 양");
			}else {
				System.out.println(" red평균 결과 : 가");
			}
			
	
		}else if(bean.getClass().getName().equals("di_p.Blue")) {
			System.out.println(bean+" : blueblueblue");
			Blue bb = (Blue)bean;
			
			int bjum = bb.getJum();
			System.out.println("b들의 점수 "+bjum);
			if(bb.getJum()>90) {
				bb.setType("수");
			}else if(bb.getJum()>80) {
				bb.setType("우");
			}else if(bb.getJum()>70) {
				bb.setType("미");
			}else if(bb.getJum()>60) {
				bb.setType("양");
			}else{
				bb.setType("가");
			}
			
			
		}else if(bean.getClass().getName().equals("di_p.Yellow")) {
			System.out.println(bean+"yellow인가!");
			Yellow yy = (Yellow)bean;
			
			int yjum = yy.getJum();
			int yavjum = yy.getJum()/4;
			System.out.println("y들의 총점 : " + yjum);
			System.out.println("y들의 평균 : " + yavjum);
			
			if(yy.getJum()>80) {
				yy.setType("1");
			}
			
			
			
			
		}
		
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		
		//System.out.println("MyBeanPostProcessor.AfterInit 실행 : "+beanName+" => "+ bean);
		
		if(bean.getClass().getName().equals("di_p.Coffee")) {
			System.out.println(bean+" : After 커피인가");
			Coffee uu = (Coffee)bean;
			
			if(uu.getName().equals("아메리카노")) {
				uu.setType("건맨");
			}
			
		}
		
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
}
