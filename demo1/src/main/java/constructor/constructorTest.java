package constructor;

import javax.management.InvalidApplicationException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class constructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ApplicationContext context =new ClassPathXmlApplicationContext("constructor/Constructor.xml");
		
		Constructor p =(Constructor) context.getBean("cons");
		Constructor p1 =(Constructor) context.getBean("cons1");
		System.out.println(p);
		System.out.println(p1);

	}

}
