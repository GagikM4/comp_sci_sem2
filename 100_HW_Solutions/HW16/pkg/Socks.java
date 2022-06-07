package pkg;
import java.util.Scanner;
import java.util.Random;


public class Socks extends Clothing{
	String type;
	
	public Socks(){
		type = "long";
	}
	public Socks(double price, String type){
		super(price);
		this.price = price;
		this.type = type;
	}
	public void setType(String a){
		type = a;
		return;
	}
	public String getType(){
		return type;
	}
}
