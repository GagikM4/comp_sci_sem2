import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	int []x = new int[1000];
	Random rand = new Random();
	for(int b = 0; b < x.length; b++){
		int a = rand.nextInt(1000) + 1;
		x[b] = a;
	}
	for(int count = 0; count < x.length; count++){
		System.out.print(x[count] + " ");
	}
	}
}
