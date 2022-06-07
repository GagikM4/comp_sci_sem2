import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int moneystart = 100;
	System.out.println("| WELCOME TO THE SLOT MACHINE |");
	System.out.println("RULES!:");
	System.out.println("1. You Have $100.");
	System.out.println("2. Wager In Less Than Or Equal To Your Total Amount Of Money.");
	System.out.println("3. You Will See Three Numbers Being Output After Each Roll (1 to 10).");
	System.out.println("	i. If All Numbers Match, Your Wagered Money Will Triple.");
	System.out.println("	ii. If Two Numbers Match, Your Wagered Money Will Triple.");
	System.out.println("	iii. If No Correlation, You Loose All Of Your Wagered Money.");
	System.out.println("																	");
	System.out.println("——————————––––—————–––––——––––––––––––––––––––––––––––––––––––––––––––");
	System.out.println("																	");
	while(true){
	System.out.println("	");
	System.out.println("Would You Like To Play Slots? (Yes/No)");
	String choice1 = sc.nextLine();
	if(choice1.equals("Y") || choice1.equals("Yes") || choice1.equals("y") || choice1.equals("yes"))
	{
		System.out.println("You Have $" + (moneystart) + "." + " How Much Would You Like To Wager?");
		int choice2 = sc.nextInt();
		sc.nextLine();
		System.out.println("	");
		if(choice2 <= moneystart && choice2 > 0)
		{
			System.out.println("Great! Good Luck!");
			System.out.println("Beep. Boop. Rolling Numbers");
			System.out.println("Your Rolls Are:");
			System.out.println("––––––––––––––––");
			int a = rand.nextInt(10)+ 1;
			int b = rand.nextInt(10) + 1;
			int c = rand.nextInt(10) + 1;
			System.out.println("| " + a + " | " + b + " | " + c + " |");
			System.out.println("––––––––––––––––");
			if(a==b && a==c)
			{
				int money1 = (3 * choice2 + moneystart);
				System.out.println("Congrats!! You Tripled Your Wager!");
				System.out.println("You Have $" + (choice2*3 + moneystart));
				System.out.println("-------------------------------------");
				moneystart = money1;
			}
			else if(a==b || a==c || b==c)
			{
				int money2 = (2 * choice2 + moneystart);
				System.out.println("Congrats! You Doubled Your Wager!");
				System.out.println("You Have $" + (choice2*2 + moneystart));
				System.out.println("-------------------------------------");
				moneystart = money2;
			}
			else if(a!=b && a!=c && b!=c)
			{
				int money3 = (moneystart - choice2);
				System.out.println("Oops, Looks Like You Ran Out Of Luck, Sorry About That.. Better Luck Next Time!");
				System.out.println("You Have $" + (moneystart - choice2) + " Left");
				System.out.println("---------------------------------------------");
				moneystart = money3;
				if(money3 == 0){
				break;
			}
			}
		}
		else
		System.out.print("Insufficient Amount Of Money!");
		System.out.println("	");
	}
	else if(choice1.equals("N") || choice1.equals("No") || choice1.equals("n") || choice1.equals("no"))
	{
		System.out.println("Hope You Had A Good Time!");
		System.out.println("Goodbye!! Come Back Again!!");
		break;
	}
	}
	}
}
