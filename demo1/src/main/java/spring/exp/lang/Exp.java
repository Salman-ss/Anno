package spring.exp.lang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Exp {

	@Value("#{15+17}")
	private int x;
	@Value("#{99+20}")
	private int y;
	@Value("#{  T(java.lang.Math).sqrt(16)}")
	private int z;
	@Value("#{  T(java.lang.Math).E}")
	private double e;
	
	@Value("#{  T(java.lang.Math).PI}")
	private double pi;
	public int getX() {
		return x;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Exp [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", pi=" + pi + "]";
	}
	
	
	
	
	
}
