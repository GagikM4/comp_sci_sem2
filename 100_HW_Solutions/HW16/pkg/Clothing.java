package pkg;
import java.util.Scanner;
import java.util.Random;


public class Clothing{
	double price;
	String clothingProducer;
	
	public Clothing(){
		this(0, "Lefty Production Co.");
	}
	public Clothing(double price, String clothingProducer){
		this.price = price;
		this.clothingProducer = clothingProducer;
	}
	public Clothing(double price){
		this.price = price;
		this.clothingProducer = "Lefty Production Co.";
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double a){
		price = a;
		return;
	}
	public String getClothingProducer(){
		return clothingProducer;
	}
	public void setClothingProducer(String a){
		clothingProducer = a;
		return;
	}
}
