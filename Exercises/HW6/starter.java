import java.util.Scanner;

	class starter {
	public static int div(int y) {
	int a = 2;
	while(true){
		int z = y%a;
		if(z != 0 || z != 1){
			a = a + 1;
			break;
		}
		else if(y == 0 || z == 0){
			a = a + 1;
			y = y - 1;
			System.out.println(" ");
			break;
		}
		else if(z == 1){
			a = a + 1;
			break;
		}
	}
		return y;
	}

	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int x = 2;
	int a = 2;
	System.out.print("Input a number, every prime number prior to your number will be printed out: ");
	int num = sc.nextInt();
	while(true){
		int y = num%x;
		if(y != 0){
			div(y);
			if(y%2 != 0){
			System.out.println(x);
			}
			if(x == num - 1){
				break;
			}
			}
		if(y == 0){
			num = num - 1;
		}
		x = x + 1;
		}

	}
	}
	
	
	
