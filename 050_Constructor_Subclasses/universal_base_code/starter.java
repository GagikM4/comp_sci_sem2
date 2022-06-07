import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Performer performer1 = new Performer();
		Performer performer2 = new Performer("Gagik", 17);
		
		Musician musician1 = new Musician();
		Musician musician2 = new Musician("Guitar");
		Musician musician3 = new Musician("Gagik", "Guitar");
		Musician musician4 = new Musician("Gagik", 17, "Guitar");
		
		performer1.getName();
		performer1.practice();
		performer2.getName();
		performer2.perform();
		
		musician1.getName();
		musician1.perform();
		musician1.playInstrument();
		musician2.practice();
		musician2.getInstrument();
		musician3.getName();
		musician3.practice();
		musician3.getInstrument();
		musician4.getName();
		musician4.perform();
		musician4.playInstrument();
	}
}
