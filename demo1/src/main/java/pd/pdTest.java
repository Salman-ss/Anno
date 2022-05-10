package pd;

import javax.management.InvalidApplicationException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class pdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ApplicationContext context =new ClassPathXmlApplicationContext("pd/pd.xml");
		
		PD p =(PD) context.getBean("pd1");
		System.out.println(p);

	}

}
