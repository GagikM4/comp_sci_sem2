import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String wizard = new String("Healing, Fire Spells, Morale Boost, Beast Summoning");
		String warrior = new String("Max Health, Resistance To Physical Attacks, Increased Chance Of Critical Strikes");
		String rouge = new String("Improved Agaility, Dual Blades, Quick Recovery, Dash, Small Distance Teleportation");
		System.out.println("Choose your path:");
		System.out.println("Wizard/Warrior/Rouge");
		String character = sc.nextLine();
		System.out.println("Your character's abilities are:");
		if(character.equals("Wizard") || character.equals("wizard"))
		{
			System.out.println(wizard);
		}
		else if(character.equals("Warrior") || character.equals("warrior"))
		{
			System.out.println(warrior);
		}
		else if(character.equals("Rouge") || character.equals("rouge"))
		{
			System.out.println(rouge);
		}
		else
		System.out.println("Invalid Character");
	}
}
