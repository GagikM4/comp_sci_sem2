package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	public static int magicSquare(int n){
		int i = 0;
		int c = 1;
		int d = 1;
		int lol = 0;
		double f;
		int number = n;
		
		System.out.println("The perfect squares with the total amount of " + n + " are: ");
		while(true){
			f = Math.sqrt(c);
			f = Math.round(f);
			if(c/1 == f*f){
				while(lol +d <= c){
					lol = d + lol;
					d++;
				}
					if(lol == c){
						i++;
						System.out.println(c);
						d = 1;
						lol = 0;
						if(i == n){
							break;
						}
					}
			}
			c++;
		}
		return n;
	}
}