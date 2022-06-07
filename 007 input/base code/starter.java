import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your first name?");
		String name = sc.nextLine();
		System.out.println("How old are you?");
		int age = sc.nextInt();
		System.out.println("What month were you born in? (i.e. 01/xx/xxxx)");
		int month = sc.nextInt();
		System.out.println("What day of the month were you born in? (xx/01/xxxx)");
		int day = sc.nextInt();
		System.out.println("What year where you born in? (xx/xx/2000)");
		int year = sc.nextInt();
		System.out.println("How much money is a dollar and fifty cents numerically?");
		double money = sc.nextDouble();
		
		System.out.println("Your name is " + name + ".");
		System.out.println("You are " + age + " years old.");
		System.out.println("Your birth month is " + month + ".");
		System.out.println("Your birth date is " + day + ".");
		System.out.println("You were born in the year of " + year + ".");
		System.out.println("Your bank account has " + money + " dollars.");
		
		
		
	}
}
