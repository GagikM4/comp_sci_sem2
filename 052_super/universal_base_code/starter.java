import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Apprentice apprentice1 = new Apprentice();
		Apprentice apprentice2 = new Apprentice("UCLA", 0);
		Apprentice apprentice3 = new Apprentice("guitar", "UCLA", 0);
		Apprentice apprentice4 = new Apprentice("Harry", 18, "guitar", "UCLA", 0);
		
		apprentice1.playInstrument();
		apprentice2.practice();
		apprentice3.perform();
		apprentice4.practiceAtUniversity();
	}
}