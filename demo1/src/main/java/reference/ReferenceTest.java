package reference;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ApplicationContext context =new ClassPathXmlApplicationContext("reference/reference.xml");
		
		Reference p =(Reference) context.getBean("ref1");
		System.out.println(p);

	}

}
