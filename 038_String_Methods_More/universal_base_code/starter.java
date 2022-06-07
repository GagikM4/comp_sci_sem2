import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Write your full name. (First, Last)");
	String a = sc.nextLine();
	int b = a.indexOf(" ");
	System.out.println("Your last name is: " + a.substring(b));
	}
}
