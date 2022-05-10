package standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ApplicationContext cons =
				new ClassPathXmlApplicationContext("standalone/collection/stand.xml");
		
		 Employee e= (Employee) cons.getBean("sam");
		 
		 System.out.println(e);
		 System.out.println(e.getData().getClass().getName());
		 

	}

}
