import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Input a random number: ");
	int x = sc.nextInt();
	System.out.println("Input a different number: ");
	int y = sc.nextInt();

	if(x>y)
	System.out.println("Your variables are different");
	if(x<y)
	System.out.println("Your variables are different");
	if(x==y)
	System.out.println("Your variables are the same");
	}
}