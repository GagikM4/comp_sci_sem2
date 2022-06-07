import java.util.*;


class starter {
	public static void SelectionSort(ArrayList <Integer> arr){
		int outer;
		int inner;
		int min;
		for(outer = 0; outer < arr.size(); outer++){
			min = outer;
			for(inner = outer + 1; inner<arr.size(); inner++){
				if(arr.get(inner) < arr.get(outer)){
					min = arr.get(inner);
				}
			}
			int temp = arr.get(outer);
			arr.set(outer, arr.get(min));
			arr.set(min, temp);
			System.out.print(arr.get(min) + " ");
		}
	}
	public static void BubbleSort(ArrayList <Integer> arr){
		for(int outer = 0; outer < arr.size() - 1; outer++){
			for(int inner = 0; inner < arr.size() - outer - 1; inner++){
				if(arr.get(inner) > arr.get(inner) + 1){
					int temp = arr.get(inner);
					arr.set(inner, arr.get(inner + 1)); //= arr.get(inner + 1);
					arr.set(inner + 1, temp); //= temp;
				}
			}
		}
	}
	public static void main(String args[]) {
		ArrayList <Integer> arr = new ArrayList(100);
		Random rand = new Random();
		for(int i = 0; i<100; i++){
			int a = rand.nextInt(100);
			arr.add(a);
		}
	//	for(int c = 0; c<arr.length; c++){
	//		System.out.println(arr[c] + " ");
	//	}
		BubbleSort(arr);
		SelectionSort(arr);
	}
}
