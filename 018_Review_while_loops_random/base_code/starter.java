import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int x = rand.nextInt(1000) + 1;
	while(true)
	{
		System.out.println("Guess a number from 1 to 1000:");
		int a = sc.nextInt();	
		if(x>a)
		{
			System.out.println("Your guess is too low!\n");
		}
		else if(x<a)
		{
			System.out.println("Your guess is too high!\n");
		}
		else if(x==a)
		{
			break;
		}
	}
	System.out.println("Correct!");
	
		
	}
}
