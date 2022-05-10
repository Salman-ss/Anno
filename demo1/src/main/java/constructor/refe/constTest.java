package constructor.refe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class constTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor/refe/constr.xml");
		
		secondRefe sr = (secondRefe) context.getBean("crs");
		
		System.out.println(sr);

	}

}
