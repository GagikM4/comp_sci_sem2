package pkg;
import java.util.Scanner;
import java.util.Random;

public class Wizard{
	String name;
	int health; 
	int attack;
	Random rand = new Random();
	
	public Wizard() {
		name = "Wizard";
		health = 0;
		attack = 0;
	}
	public String Wizard(String a, int b, int c){
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
	public void attack(int a){
		int b = rand.nextInt(15) + 1;
		getHealth();
		health = this.health - attack;
		return;
	}
}