package pkg;
import java.util.Scanner;
import java.util.Random;

public class BaseClass {
	int c;
	int max;
	int min;
	int sum;
	int average;
	public BaseClass(){
	int c = 0;
	int max = 0;
	int min = 1000;
	int sum = 0;
	int average;
	}
	public static void toStringArray(int []x){
		System.out.println();
		for(c = 0; c < num.length; c++){
			num[c] = rand.nextInt(99) + 1;
			System.out.print(num[c] + " ");
		}
	}
	public static void getArrayAverage(int []x){
		int sum = 0;
		for(c = 0; c < num.length; c++){
		sum = sum + num[c];
		}
		System.out.println("The average is: " + sum/a);
	}
	public static void getArrayMax(int []x){
		max = 0;
		for(c = 0; c < num.length; c++){
			if(num[c] > max){
				max = num[c];
			}
		}
		System.out.println("Th4 largest value is: " + max);
	}
	public static void getArrayMin(int []x){
		min = 1000;
		for(c = 0; c < num.length; c++){
			if(num[c] < min){
			min = num[c];
			}
		}
		System.out.println("The smallest value is: " + min);
	}
}

