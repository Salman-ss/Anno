package acdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class A {
	
	@Autowired
	@Qualifier("b")
	private B b;

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	
}
