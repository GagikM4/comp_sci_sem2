import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
//	character myCharacter = new character();
//	System.out.println(myCharacter.rouge);
	Random rand = new Random();
	Dwarf []x = new Dwarf[100];
		int d;
		int a = 0;
		for(d = 0; d<x.length; d++){
			x[d] = new Dwarf();
		}
		
		for(d = 0; d<x.length; d++){
			int num = rand.nextInt(7);
			if(num == 0){
				x[d].setName("Grumpy");
			}
			if(num == 1){
				x[d].setName("Dopey");
			}
			if(num == 2){
				x[d].setName("Happy");
			}
			if(num == 3){
				x[d].setName("Doc");
			}
			if(num == 4){
				x[d].setName("Bashful");
			}
			if(num == 5){
				x[d].setName("Sneezy");
			}
			if(num == 6){
				x[d].setName("Sleepy");
			}
		}
		for(d = 0; d<x.length; d++){
			int b = rand.nextInt(100) + 1;
			x[d].setAge(b);
			System.out.println(x[d].getName() + " is " + x[d].getAge());
		}
		String name = x[0].getName();
		x[0].setName(x[0].getName());
		for(d = 0; d<x.length; d++){
			String nameSample = x[d].getName();
			if(x[0].isSameName(nameSample) == true){
				a++;
			}
		}
		System.out.println("First Dwarf is, " + x[0].getName() + ". There are " + a + " of " + x[0].getName() + "s.");
	}
}