package stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext con = 
				new ClassPathXmlApplicationContext("stereotype/stereo.xml");
		
		Mobiles mo = (Mobiles) con.getBean("mobiles");
		System.out.println(mo);
		System.out.println(mo.getSpecification());
	}

}
