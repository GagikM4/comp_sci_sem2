import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		String [] spaces = {"T", null, "S", null, null, "J", "D"};
		consolidate(spaces);
		for(int i = 0; i<spaces.length; i++){
			System.out.println(spaces[i]);
		}
	}
}