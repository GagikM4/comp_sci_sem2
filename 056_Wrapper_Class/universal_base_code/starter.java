import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Integer inte = 4646;
		Double doub = 6.9;
		Boolean bool = true;
		Character cha = 'L';
		
		System.out.println(inte);
		System.out.println(doub);
		System.out.println(bool);
		System.out.println(cha);
		
		String sinte = inte.toString();
		String sdoub = doub.toString();
		String sbool = bool.toString();
		String scha = cha.toString();
		
		System.out.println(sinte.length());
		System.out.println(sdoub.length());
		System.out.println(sbool.length());
		System.out.println(scha.length());
	}
}
