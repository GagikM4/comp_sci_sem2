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
		System.out.println("Input the strength level of your character (1-10):");
		int strength = sc.nextInt();
		System.out.println("Input the dexterity level of your character (1-10):");
		int dexterity = sc.nextInt();
		System.out.println("Input the intelligence level of your character (1-10):");
		int intelligence = sc.nextInt();
		System.out.println("Input the constitution level of your character (1-10):");
		int constitution = sc.nextInt();
		System.out.println("Input the charisma level of your character (1-10):");
		int charisma = sc.nextInt();
		sc.nextLine();
		myCharacter a = new myCharacter();
		myCharacter b = new myCharacter(character);
		myCharacter c = new myCharacter(strength, dexterity, intelligence, constitution, charisma);
		a.choice1();
		b.choice1();
		c.myToString();
		myCharacter d = new myCharacter();
		myCharacter e = new myCharacter();
		myCharacter f = new myCharacter();
		myCharacter g = new myCharacter();
		myCharacter h = new myCharacter();
		myCharacter i = new myCharacter();
		b.setRole(character);
		d.setStrength(strength);
		e.setDexterity(dexterity);
		f.setIntelligence(intelligence);
		g.setConstitution(constitution);
		h.setCharisma(charisma);
		i.setAll(character, strength, dexterity, intelligence, constitution, charisma);
	}
}