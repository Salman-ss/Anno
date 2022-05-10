package constructor;

public class Constructor {

	private int rollno;
	private String name;
	private String city;
	public Constructor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Constructor(int rollno, String name, String city) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Constructor [rollno=" + rollno + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	
	
	
	
}
