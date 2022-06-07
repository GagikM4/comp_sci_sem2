import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	int a = 2;
	System.out.print("Input a number:");
	int x = sc.nextInt();
	int y = x + 4;
	while(true)
	{
		System.out.println(x);
		if(x==y)
		{
			break;
		}
		x = x + 1;
	}
	}
}
