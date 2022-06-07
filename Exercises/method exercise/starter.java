import java.util.Scanner;

class starter{
	public static String product(int a, int b){
		int c = a*b;
		if(c%3 == 0){
		return "It is divisible by 3";
		}
		else{
		return "It is not divisible by 3";
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a integer:");
		int a = sc.nextInt();
		System.out.println("Input a different integer;");
		int b = sc.nextInt();
		System.out.println(product(a,b));
	}
}
