import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your character:");
		System.out.println("Wizard | Rouge | Warrior");
		String character = sc.nextLine();
		myCharacter a = new myCharacter();
		myCharacter b = new myCharacter(character);
		a.choice1();
		b.choice1();
	}
}
