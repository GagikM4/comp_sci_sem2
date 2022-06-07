import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Combinatronics num = new Combinatronics();
		Scanner sc =  new Scanner(System.in);
		System.out.println("Input two nombers each up to 12");
		int n = sc.nextInt();
		int r = sc.nextInt();
		num.factorial(n);
		num.numCombinations(n, r);
		
	}
}
