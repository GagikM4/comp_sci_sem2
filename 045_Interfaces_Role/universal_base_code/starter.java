import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Role rouge = new Rouge();
		Role [] role = new Role[3];
		role[0] = new Wizard();
		role[1] = new Warrior();
		role[2] = new Rouge();
		System.out.println("Rouge name: " + role[2].getName());
	}
}
