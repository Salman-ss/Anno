package constructor.refe;

public class secondRefe {
	
	@Override
	public String toString() {
		return "secondRefe [name=" + name + ", street=" + street + ", city=" + city + ", fr=" + fr + "]";
	}
	private String name;
	private String street;
	private String city;
	private firstRefe fr;
	public secondRefe(String name, String street, String city, firstRefe fr) {
		super();
		this.name = name;
		this.street = street;
		this.city = city;
		this.fr = fr;
	}
	public secondRefe() {
		super();
		// TODO Auto-generated constructor stub
	}

}
