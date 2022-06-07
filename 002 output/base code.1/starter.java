class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		String name = new String("Gagik");
		String birthday = new String("Happy Birthday to you!");
		String age = new String("17");

		System.out.println(birthday); 
		System.out.println(birthday);
		System.out.print("Happy Birthday, Dear ");
		System.out.println(name);
		System.out.println(birthday + "!");
		System.out.println("I am " + age + " years old!");
		int [] arr1 = new int[4];
		for(int i = 0; i < arr1.length; i++){
			arr1[i] = 1;
		}
		for(int i = 0; i < arr1.length - 1; i++){
			arr1[i] = arr1[i + 1] + arr1[i];
			int sum = arr1[i];
		}
		System.out.println(arr1);
	}
}
