import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void BubbleSort(int [] arr){
		for(int outer = 0; outer < arr.length - 1; outer++){
			for(int inner = 0; inner < arr.length - outer - 1; inner++){
				if(arr[inner] > arr[inner + 1]){
					int temp = arr[inner];
					arr[inner] = arr[inner + 1];
					arr[inner + 1] = temp;
				}
				System.out.println(arr[inner] + " ");
			}
		}
	}
	public static void main(String args[]) {
		int [] arr = new int[10];
		Random rand = new Random();
		for(int i = 0; i<arr.length; i++){
			int a = rand.nextInt(100);
			arr[i] = a;
		}
	//	for(int c = 0; c<arr.length; c++){
	//		System.out.println(arr[c] + " ");
	//	}
		BubbleSort(arr);
	}
}
