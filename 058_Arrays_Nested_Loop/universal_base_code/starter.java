import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [][] arr = new int[75][75];
		Random rand = new Random();
		for(int x = 0; x<arr.length; x++){
			for(int y = 0; y<arr[0].length; y++){
				int a = rand.nextInt(10);
				arr[x][y] = a;
				System.out.print(arr[x][y] + " ");
			}
			System.out.println("");
		}
	}
}
