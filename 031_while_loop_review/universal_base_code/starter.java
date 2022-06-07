import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int []x = new int[100];
		int b = 0;
		Random rand = new Random();
		for(b = 0; b < x.length; b++){
			int a = rand.nextInt(99)+1;
			x[b] = a;
			System.out.println(a);
		}
		
	}
}
