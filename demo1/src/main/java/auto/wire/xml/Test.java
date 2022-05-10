package auto.wire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("auto/wire/xml/auto.xml");
		Mobile m = (Mobile) context.getBean("mobile");
		
		System.out.println(m);
		
	}

}
