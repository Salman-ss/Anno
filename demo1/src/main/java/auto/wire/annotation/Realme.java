package auto.wire.annotation;

public class Realme {
	
	private String mno;
	private String color;
	private int price;
	private int battery;
	public String getMno() {
		return mno;
	}
	public void setMno(String mno) {
		this.mno = mno;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	public Realme(String mno, String color, int price, int battery) {
		super();
		this.mno = mno;
		this.color = color;
		this.price = price;
		this.battery = battery;
	}
	
	
	public Realme() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Realme [mno=" + mno + ", color=" + color + ", price=" + price + ", battery=" + battery + "]";
	}
	
	
	

}
