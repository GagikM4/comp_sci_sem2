import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Write a word:");
	String a = sc.nextLine();
	
	int c = 1;
	int d = 0;
	while(true){
	System.out.println(d + " " + a.substring(c - 1,c));
	if(c == a.length()){
		break;
	}
	c++;
	d++;
	}
	}
}
