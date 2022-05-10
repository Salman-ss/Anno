package acdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext con = new ClassPathXmlApplicationContext("acdemo/annotation.xml");
		
		 A a = (A) con.getBean("b");
		 System.out.println(a);

	}

}
