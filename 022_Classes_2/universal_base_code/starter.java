import pkg.*;
import java.util.Scanner;
import java.util.Random;



class starter {
	public static void main(String args[]) {
//	character myCharacter = new character();
//	System.out.println(myCharacter.rouge);	
	Dwarf []x = new Dwarf[100];
		int d;
		for(d = 0; d<x.length; d++){
			int num = rand.nextInt(7);
			if(num = 0){
				x[d] = new Dwarf("Grumpy");
			}
			if(num = 1){
				x[d] = new Dwarf("Dopey");
			}
			if(num = 2){
				x[d] = new Dwarf("Happy");
			}
			if(num = 3){
				x[d] = new Dwarf("Sneezy");
			}
			if(num = 4){
				x[d] = new Dwarf("Bashful");
			}
			if(num = 5){
				x[d] = new Dwarf("Sneezy");
			}
			if(num = 6){
				x[d] = new Dwarf("Sleepy");
			}
			int age = rand.nextInt(100) + 1;
		}
		for(d = 0; d<x.lenth; d++){
			int age = rand.nextInt(100) + 1;
			System.out.println(x[d] + " is " + age);
		}
	}
	}

