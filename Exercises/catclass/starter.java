import java.util.Scanner;


class Cat{
	String name;
	
	public Cat(){
		name = "Garfield";
	}
	public Cat(String a){
		name = a;
	}
	public void meow(){
		System.out.println(name + " *meows*");
		return;
	}
	
}

class starter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("State cat name:");
		String name = sc.nextLine();
		Cat x = new Cat();
		Cat y = new Cat(name);
		x.meow();
		y.meow();
	}
}
