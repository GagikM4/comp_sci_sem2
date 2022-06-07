package pkg;
import java.util.Scanner;
import java.util.Random;

public class Rouge{
	String name;
	int health; 
	int attack;
	Random rand = new Random();
	
	public Rouge() {
		name = "Rouge";
		health = 0;
		attack = 0;
	}
	public String Rouge(String a, int b, int c){
		name = a;
		health = b;
		attack = c;
		return name;
	}
	public void setHealth(int health){
		this.health = health;
		return;
	}
	public int getHealth(){
		return health;
	}
	public String setName(){
		return name;
	}
	public void attack(Wizard a){
		int b = rand.nextInt(15) + 1;
		int c =	a.getHealth();
		c = c - b;
		return;
	}
	public void attack(Warrior a){
		int b = rand.nextInt(15) + 1;
		int c =	a.getHealth();
		c = c - b;
		return;
	}
}
