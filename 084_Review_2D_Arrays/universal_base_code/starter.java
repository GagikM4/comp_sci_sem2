import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr1 = new int[4];
		for(int i = 0; i < arr1.length; i++){
			arr1[i] = 1;
		}
		for(int i = 0; i < arr1.length - 1; i++){
			arr1[i] = arr1[i + 1] + arr1[i];
			int sum = arr1[i];
		}
		String a = arr1.toString();
		System.out.println(a);
	}
}
