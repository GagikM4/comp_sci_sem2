import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose One:");
		System.out.println("Human | Cactus | Dog | Other | Mine");
		String type = sc.nextLine();
		System.out.println("Name Of The Chosen Creature:");
		String name = sc.nextLine();
		System.out.println("How Many Times Should The Creature Be Printed Out?");
		int number = sc.nextInt();
		String other = new String("Other");
		Ascii a = new Ascii();
		Ascii b = new Ascii(type, name);
		Ascii c = new Ascii(type, number);
		Ascii d = new Ascii(type, name, number);
		
		a.setType(type);
		a.setName(name);
		a.setNumber(number);
		a.printArt();
	}
}
