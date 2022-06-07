import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your first period?");
		String period1 = sc.nextLine();
		System.out.println("What is your second period?");
		String period2 = sc.nextLine();
		System.out.println("What is your third period?");
		String period3 = sc.nextLine();
		System.out.println("What is your GPA in your " + period1 + " class?");
		int x = sc.nextInt();
		System.out.println("What is your GPA in your " + period2 + " class?");
		int y = sc.nextInt();
		System.out.println("What is your GPA in your " + period3 + " class?");
		int z = sc.nextInt();
		System.out.println("Your GPA transcript is:");
		System.out.println(period1 + " – " + x);
		System.out.println(period2 + " – " + y);
		System.out.println(period3 + " – " + z);
		System.out.println("Aug GPA – " + (x+y+z)/3.0);
	}
}
