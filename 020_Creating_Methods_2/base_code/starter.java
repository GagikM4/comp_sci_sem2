import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int x, int y) {
	int z = 1;
	int a = 0;
	while(true)
	{
		System.out.println(z);
		if(y == a)
		{
		break;
		}
		z = z*x;
		a=a+1;
	}
	return z;
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a number");
		int x = sc.nextInt();
		System.out.println("Choose another number");
		int y = sc.nextInt();
		pow(x,y);
		
	}
}
