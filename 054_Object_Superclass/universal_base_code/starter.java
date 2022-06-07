import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Performer []performer = new Performer[4];
		performer[0] = new Performer();
		performer[1] = new Musician();
		performer[2] = new Actor();
		performer[3] = new Apprentice();
		
		System.out.println(performer[0]);
		System.out.println(performer[1]);
		System.out.println(performer[2]);
		System.out.println(performer[0].equals(performer[1]));
	}
}
