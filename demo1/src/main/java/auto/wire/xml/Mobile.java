package auto.wire.xml;

public class Mobile {
	
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
