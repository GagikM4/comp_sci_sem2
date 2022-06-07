package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dwarf {
	String name;
	int age;
	
	public Dwarf() {
		name = "";
		age = 0;
	}
	public Dwarf(String a, int b){
		name = a;
		age = b;
	}
	public boolean isSameName(String name){
		if(this.name == name){
			return true;
		}
		else{
			return false;
		}
	}
	public String getName(){
		return name;
	}
	public void setName(String a){
		name = a;
		return;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int a){
		age = a;
		return;
	}
}