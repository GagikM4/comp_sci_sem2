import pkg.*;
import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number:");
		int n = sc.nextInt();
		CVMath.magicSquare(n);
	}
}
