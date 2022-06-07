import java.util.Scanner;
import java.util.Random;

class Dog{
	String name;
	int age;
	String breed;
	int sleep;
	int rand1;
	String bark;
	public Dog(){
		name = "Clifford";
		age = 3;
		breed = "big red dog";
		rand1 = rand1;
	}
	public Dog(String a){
		name = a;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String a, String b){
		name = a;
		breed = b;
		age = 1;
	}
	public Dog(int a, String b){
		age = a;
		name = b;
		breed = "dog dog";
	}
	public Dog(int a){
		sleep = a;
		name = "";
		breed = "";
		age = 1;
	}
	public void getName(){
		System.out.println(name);
		return;
	}
	public void getAge(){
		System.out.println(age);
		return;
	}
	public void getBreed(){
		System.out.println(breed);
		return;
		
	}
	public void dog2(){
		System.out.println(name + " is a " + breed);
		return;
	}
	public void sleep(){
		Random rand = new Random();
		int rand1 = rand.nextInt(2) + 1;
		String bark = new String("*barks*");
		if(rand1 == 1){
			System.out.println(name + " is asleep");
		}
		else if(rand1 == 2){
			System.out.println(name + " " + bark);
		}
		if(name.equals(name + " is asleep")){
		System.out.println("Clifford" + " " + bark);
		}
	}

}

class starter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String bark = new String("*barks*");
		System.out.println("Name of dog:");
		String name = sc.nextLine();
		System.out.println("Age of dog:");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Dog breed:");
		String breed = sc.nextLine();
		Dog a = new Dog();
		Dog b = new Dog(name, breed);
		a.dog2();
		b.dog2();
		a.sleep();
		b.sleep();

	}
}