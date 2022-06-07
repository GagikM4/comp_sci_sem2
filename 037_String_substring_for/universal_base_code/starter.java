import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Write a word:");
	String a = sc.nextLine();
	
	int c;
	int d = 0;
	for(c=0; c< a.length(); c++){
	System.out.println(d + " " + a.substring(c,c+1));
	if(c == a.length()){
		break;
	}
	d++;
	}
	}
}
