package auto.compo.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Realme {
	@Value("1234")
	private String mno;
	@Value("white")
	private String color;
	@Value("19000")
	private int price;
	@Value("5000")
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
