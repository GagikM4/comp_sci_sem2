import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	
	Warrior [] x = new Warrior[100];
	Wizard [] y = new Wizard[100];
	int c;
	int d;
	int count = 0;
	int a = 0;
	for(c = 0; c< y.length; c++){
		y[c] = new Wizard("Gendolf");
	}
	for(d = 0; d< x.length; d++){
		x[d] = new Warrior("Aragorn");
	}
	d = 0;
	c = 0;
	while(true){
			if(x[d].isDead() == true){
				d++;
				if(d == 100){
					break;
				}
			}
			y[c].attack(x[d]);
			if(y[c].isDead() == true){
				c++;
				if(c == 100){
					break;
				}
			}
			x[d].attack(y[c]);
		}
		for(count = 0; count < x.length; count++){
			if(x[count].isDead() == false){
				a++;
				System.out.println("Warriors have won with " + a + " left in their army");
			}
		}
		y[c].isDead();
		for(count = 0; count < x.length; count++){
			if(y[count].isDead() == false){
				a++;
				System.out.println("Wizards have won with " + a + " left in their army");
			}
		}
	}
}