package pd;

public class PD {

	private int rollno;
	private String name;
	private String street;
	private String city;
	
	
	
	@Override
	public String toString() {
		return "PD [rollno=" + rollno + ", name=" + name + ", street=" + street + ", city=" + city + "]";
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
