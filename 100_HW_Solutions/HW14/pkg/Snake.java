package pkg;
import java.util.Scanner;
import java.util.Random;

public class Snake implements Pet{
	String name;
	int age;
	boolean trained;
	public Snake(){
		this("Google", 5, true);
	}
	public Snake(String name, int age, boolean trianed){
		this.name = name;
		this.age = age;
		this.trained = trained;
	}
	public void setName(String name){
		this.name = name;
	}
    public void setAge(int age){
    	this.age = age;
    }
    public void setIsTrained(boolean trained){
    	this.trained = trained;
    }
    public String getName(){
    	return name;
    }
    public int getAge(){
    	return age;
    }
    public boolean getIsTrained(){
    	return trained;
    }
    public void interact(){
    	System.out.println(name + " slithers up the owner's arm and hisses at others");
    }
	public void trick(){
		if(trained = true){
			System.out.println(name + " juggles apples");
		}
		else{
			System.out.println(name + " sleeps");
		}
		return;
	}
	
}