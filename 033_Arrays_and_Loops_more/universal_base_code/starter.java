import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int a = rand.nextInt(147) + 52;
		int []num = new int[a];
		System.out.println("There are " + a + " elements");
		int min = 1000;
		int c;
		for(c = 0; c < num.length; c++){
			num[c] = rand.nextInt(99) + 1;
			System.out.print(num[c] + " ");
		}
		System.out.println();
		for(c = 0; c < num.length; c++){
			if(num[c] < min){
			min = num[c];
			}
		}
		System.out.println("The smallest value is: " + min);
		int max = 0;
		for(c = 0; c < num.length; c++){
			if(num[c] > max){
				max = num[c];
			}
		}
		System.out.println("The largest value is: " + max);
		int sum = 0;
		for(c = 0; c < num.length; c++){
		sum = sum + num[c];
		}
		System.out.println("The average is: " + sum/a);
	}	
	}
