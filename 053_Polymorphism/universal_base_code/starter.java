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
		
		performer[0].practice();
		performer[0].perform();
		performer[1].perform();
		((Performer)performer[1]).practice();
		((Apprentice)performer[3]).practiceAtUniversity();
		((Musician)performer[3]).playInstrument();
		((Actor)performer[2]).monologue();
		((Performer)performer[2]).perform();
	}
}
