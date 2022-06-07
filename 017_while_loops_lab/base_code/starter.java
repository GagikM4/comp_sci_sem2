import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int a = 1;
	System.out.println("What is your name?");
	String name = sc.nextLine();
	System.out.println("How many times would you like your name to be said?");
	int x = sc.nextInt();
		while(true)
	{
		System.out.println(name);
		if(a==x)
		{
			break;
		}
		a = a + 1;
	}
	}
}
