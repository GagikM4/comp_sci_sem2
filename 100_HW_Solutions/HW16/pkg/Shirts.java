package pkg;
import java.util.Scanner;
import java.util.Random;


public class Shirts extends Clothing{
	String material;
	
	public Shirts() {
		material = "cotton";
	}
	public Shirts(String material) {
		super(9.99);
		this.material = material;
	}
	public Shirts(double price, String material){
		super(price);
		this.material = material;
	}
	public String getMaterial(){
		return material;
	}
	public void setMaterial(String a){
		material = a;
		return;
	}
}