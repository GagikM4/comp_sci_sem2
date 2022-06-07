package pkg;
import java.util.Scanner;
import java.util.Random;


public class DesignerShirts extends Shirts{
	String brand;
	
	public DesignerShirts() {
		brand = "Adidas";
	}
	public DesignerShirts(String material, String brand){
		super(material);
		this.material = material;
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setBrand(String a){
		brand = a;
		return;
	}
}
