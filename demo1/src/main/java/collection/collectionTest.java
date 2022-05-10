package collection;

import javax.management.InvalidApplicationException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class collectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ApplicationContext context =new ClassPathXmlApplicationContext("collection/collection.xml");
		
		Collection c = (Collection) context.getBean("col1");
		System.out.println(c);

	}

}
