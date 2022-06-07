import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	int rand_num1 = rand.nextInt(10);
	System.out.println(rand_num1);
	int rand_num2 = rand.nextInt(99) + 1;
	System.out.println(rand_num2);
	double rand_num3 = rand.nextDouble() + 2.5;
	System.out.println(rand_num3);
	int rand_num4 = rand.nextInt(575) + 14;
	double rand_num5 = rand.nextDouble();
	System.out.println(rand_num4 + rand_num5);
	}
}
