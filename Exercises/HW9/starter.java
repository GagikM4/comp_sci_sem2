import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	
	int count = 0;
	int b = 0;
	int c = 19;
	int []x = new int[20];
	int []y = new int[20];
	while(true){
		int a = rand.nextInt(50) + 1;
		System.out.println(a);
		x[b] = a;
		y[c] = a;
		if(count == 19){
			break;
		}
		count = count + 1;
		b ++;
		c --;
	}
	System.out.println("–––––––––––––––");
	int count2 = 0;
	while(true){
		System.out.println(y[c]);
		if(count2 == 19){
			break;
		}
		count2 = count2 + 1;
		c ++;
	}
	}
}