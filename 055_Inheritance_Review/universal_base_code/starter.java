import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		CourseClass []course = new CourseClass[4];
		course[0] = new CourseClass();
		course[1] = new Science();
		course[2] = new MathClass();
		course[3] = new History();
		
		Science []science = new Science[3];
		science [0] = new Science();
		science [1] = new APSci();
		science [2] = new RecoverySci();
		
		System.out.println(course[0].equals(course[1]));
	}
}
