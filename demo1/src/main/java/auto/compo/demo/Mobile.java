package auto.compo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	@Autowired
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
