package anno_p.coffe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties.Caffeine;

import anno_p.coffe.sub1.Americano;
import anno_p.coffe.sub1.CafeLatte;
import anno_p.coffe.sub1.CaramelMacchiato;
import jakarta.annotation.Resource;


public class Coffee {
	@Resource
	Americano am;
	@Resource
	CafeLatte cl;
	@Resource
	CaramelMacchiato cm;

	
	String name = "내커피";


	@Override
	public String toString() {
		return "Coffee [am=" + am + ", cl=" + cl + ", name=" + name + "]";
	}


	/*
	 * @Override public String toString() { return "Coffee [am=" + am + ", name=" +
	 * name + "]"; }
	 */
	
	
	
	
	
	
	
	
	



}
