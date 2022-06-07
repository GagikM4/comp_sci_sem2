import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	int c;
	int max;
	int min;
	int sum;
	int average;
	int a;
	
	public static int[] toStringArray(int []x){
	int c = 0;
	Random rand = new Random();
	for(c = 0; c < x.length; c++){
			x[c] = rand.nextInt(99) + 1;
			System.out.print(x[c] + " ");
		}
		return x;
	}
	public static int[] getArrayAverage(int []x){
		System.out.println();
		int sum = 0;
		int c;
		for(c = 0; c < x.length; c++){
		sum = sum + x[c];
		}
		System.out.println("The average is: " + sum/x.length);
		return x;
	}
	public static int[] getArrayMax(int []x){
		int max = 0;
		int c;
		for(c = 0; c < x.length; c++){
			if(x[c] > max){
				max = x[c];
			}
		}
		System.out.println("The largest value is: " + max);
		return x;
	}
	public static int[] getArrayMin(int []x){
		int min = 1000;
		int c;
		for(c = 0; c < x.length; c++){
			if(x[c] < min){
			min = x[c];
			}
		}
		System.out.println("The smallest value is: " + min);
		return x;
	}

	public static void main(String args[]) {
		Random rand = new Random();
		int a = rand.nextInt(147) + 52;
		int []num = new int[a];
		System.out.println("There are " + a + " elements");
		toStringArray(num);
		getArrayAverage(num);
		getArrayMax(num);
		getArrayMin(num);
	}
}
