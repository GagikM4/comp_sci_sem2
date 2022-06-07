package pkg;
import java.util.Scanner;
import java.util.Random;

public class Performer{
	protected String name;
	protected int age;
	
	public Performer(){
		this("Doja Cat", 26);
	}
	public Performer(String name){
		this(name, 26);
	}
	public Performer(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public void practice(){
		System.out.println(name + " is practicing");
		return;
	}
	public void perform(){
		System.out.println(name + " is performing");
		return;
	}
}