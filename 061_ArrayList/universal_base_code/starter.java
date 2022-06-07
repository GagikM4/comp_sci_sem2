import java.util.ArrayList;
import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList <String> arr = new ArrayList<String>();
		System.out.println("Input an integer:");
		int a = sc.nextInt();
		int c = 0;
		while(true){
			arr.add(c, "cookie");
			if(c == a){
				System.out.println("You have " + c + " cookies");
				break;
			}
			c++;
		}
	}
}
