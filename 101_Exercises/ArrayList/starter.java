import java.util.*;

class starter {
	public static void printArrayList(ArrayList<Integer> arr){
	for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + " ");
		}
		return;
	}
	public static void addValuesList(int n, ArrayList<Integer> arr){
		Random rand = new Random();
		for(int i = 0; i<n; i++){
			int a = rand.nextInt(100);
			arr.add(a);
		}
		return;
	}

	public static void main(String args[]) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> arr = new ArrayList<Integer>(1);
		System.out.println("How many values would you like to add to the list?");
		int n = sc.nextInt();
		addValuesList(n, arr);
		printArrayList(arr);
	}
}
