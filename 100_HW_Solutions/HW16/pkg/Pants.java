package pkg;
import java.util.Scanner;
import java.util.Random;


public class Pants extends Clothing{
	int length;
	
	public Pants() {
		length = 0;
	}
	public Pants(double price, int length){
		super(price);
		this.price = price;
		this.length = length;
	}
	public int getLength(){
		return length;
	}
	public void setLength(int a){
		length = a;
		return;
	}
}