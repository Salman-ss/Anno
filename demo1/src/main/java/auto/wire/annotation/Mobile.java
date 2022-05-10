package auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Mobile {
	
	@Autowired
	@Qualifier("realme2")
	private Realme realme;
	
	

	public Mobile(Realme realme) {
		super();
		this.realme = realme;
	}


	public Realme getRealme() {
		return realme;
	}
	
	public void setRealme(Realme realme) {
		this.realme = realme;
	}

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mobile [realme=" + realme + "]";
	}
	

}
