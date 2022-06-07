import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int attack = rand.nextInt(15) + 1;
		int health = rand.nextInt(15) + 1;
		Warrior warrior = new Warrior();
		Wizard wizard = new Wizard();
		Rouge rouge = new Rouge();
		rouge.Rouge("Smeagol", 0, 0);
		wizard.Wizard("Gendolf", 0, 0);
		warrior.Warrior("Aragorn", 0, 0);
		System.out.println(rouge.setName());
		System.out.println(wizard.setName());
		System.out.println(warrior.setName());
	}
}
