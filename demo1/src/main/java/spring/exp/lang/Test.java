package spring.exp.lang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/exp/lang/stereo.xml");
		
		  Exp e = (Exp) context.getBean("exp");
		  
		  System.out.println(e);

	}

}
