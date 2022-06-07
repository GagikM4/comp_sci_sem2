import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int x = 0;
	int y = 1;
	System.out.println("Intput any number:");
	int a = sc.nextInt();
	System.out.println("Input a different number:");
	int b = sc.nextInt();
if(a!=0)
{
	//a = a%2;
		if(a%2 == x)
		{
			System.out.println("Your first integer is an even number");
			if(a%3 == x)
			{
				System.out.println("It is divisible by 3");
			}
			else
			System.out.println("It is not divisible by 3");
			if(a%5 == x)
			{
				System.out.println("It is divisible by 5");
			}
			else
			System.out.println("It is not divisivle by 5");
			if(a%4 == x)
			{
				System.out.println("It is divisible by 4");
			}
			else
			System.out.println("It is not divisivle by 4");
		}
		if(a%2 == y)
		{
			System.out.println("Your first integer is an odd number");
			if(a%3 == x)
			{
				System.out.println("It is divisible by 3");
			}
			else
			System.out.println("It is not divisible by 3");
			if(a%5 == x)
			{
				System.out.println("It is divisible by 5");
			}
			else
			System.out.println("It is not divisivle by 5");
			if(a%4 == x)
			{
				System.out.println("It is divisible by 4");
			}
			else
			System.out.println("It is not divisivle by 4");
		}

}
else
System.out.println("Your first integer is 0");
if(b!=0)
{
		if(b%2 == x)
		{
			System.out.println("Your second integer is an even number");
			if(b%3 == x)
			{
				System.out.println("It is divisible by 3");
			}
			else
			System.out.println("It is not divisible by 3");
			if(b%5 == x)
			{
				System.out.println("It is divisible by 5");
			}
			else
			System.out.println("It is not divisivle by 5");
			if(b%4 == x)
			{
				System.out.println("It is divisible by 4");
			}
			else
			System.out.println("It is not divisivle by 4");
		}
		if(b%2 == y)
		{
			System.out.println("Your second integer is an odd number");
			if(b%3 == x)
			{
				System.out.println("It is divisible by 3");
			}
			else
			System.out.println("It is not divisible by 3");
			if(b%5 == x)
			{
				System.out.println("It is divisible by 5");
			}
			else
			System.out.println("It is not divisivle by 5");
			if(b%4 == x)
			{
				System.out.println("It is divisible by 4");
			}
			else
			System.out.println("It is not divisivle by 4");
		}

}
else
System.out.println("Your second integer is a 0");
}
}
