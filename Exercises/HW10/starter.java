
import java.util.Random;

class starter {
	public static void main(String args[]) {
	int [] x = new int[20];
	Random rand = new Random();
	int rand1 = rand.nextInt(10) + 1;
	int b;
	System.out.println("Random targert number is: " + rand1);
	System.out.println("Randomly generated numbers: ");
	for(b = 0; b < x.length; b++){
		int	rand2 = rand.nextInt(10) + 1;
		System.out.print(rand2 + " ");
		x[b] = rand2;
	}
	System.out.println("");
	int count = 0;
	while(true){
		if(count > 19){
			break;
		}
		if(x[count] == rand1 && count <= 19){
		System.out.println("Duplicate found at index " + count);
		}
		count++;
	}
	count = 0;
	while(true){
		if(count == 19){
			break;
		}
		if(x[count] == x[count + 1]){
			System.out.println("Two in a two in a row of " + x[count] + " are found at indexes " + count + " and " + (count + 1));
		}
		count++;
	}
	}
}
