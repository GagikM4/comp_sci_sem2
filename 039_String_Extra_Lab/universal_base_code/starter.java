import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a phrase:");
	String phrase = sc.nextLine();
	int space = phrase.indexOf(" ");
	String word1 = phrase.substring(0, space);
	System.out.println(word1);
	String wordn;
	int d = 0;
	for(int c = phrase.length(); c> 0; c--){
		if(phrase.substring(c - 1, c).equals(" ")){
			d++;
			System.out.println(phrase.substring(c - 1, phrase.indexOf(" ")));
		}
	}
	System.out.println(d);
	wordn = phrase.substring(space, phrase.indexOf(" "));
		System.out.println(wordn);
	
	}
}
