import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int i;
		Random rand = new Random();
		Dog Snoopy = new Dog();						// Default Constructor
		Dog Snoopy2 = new Dog(36);					// Age Constructor
		Dog Snoop3 = new Dog(true);					// Trained Constructor
		Dog Toto = new Dog("Toto");					// Name Constructor
		Dog Clifford = new Dog("Clifford", true);	// Name, Trained Constructor
		Dog Scooby = new Dog("Scooby", 50, false);	// Name, Age, Trained Constructor

		Cat Felix = new Cat("Felix", 100, true);	// Name, Age, Trained Constructor
	
		Pet []Google  = new Snake[5];
	
		Pet []Edgar = new Raven[5];
		
		for(i = 0; i<Google.length; i++){
			Google[i] = new Snake();
		}
		for(i = 0; i<Edgar.length; i++){
			Edgar[i] = new Raven();
		}
		
		for(i = 0; i<Google.length; i++){
			int a = rand.nextInt(2);
			if(a == 0){
				Google[i].setIsTrained(true);
			}
			if(a == 1){
				Google[i].setIsTrained(false);
			}
			Google[i].interact();
			Google[i].trick();
		}
		for(i = 0; i<Edgar.length; i++){
			int a = rand.nextInt(2);
			if(a == 0){
				Edgar[i].setIsTrained(true);
			}
			if(a == 1){
				Edgar[i].setIsTrained(false);
			}
			Edgar[i].interact();
			Edgar[i].trick();
		}
		
		System.out.println();
		Clifford.trick();							// Trained trick
		Scooby.trick();								// Untrained trick
		Felix.trick();
	}
}