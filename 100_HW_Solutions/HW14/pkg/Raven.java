package pkg;
import java.util.Scanner;
import java.util.Random;

public class Raven implements Pet{
	String name;
	int age;
	boolean trained;
	
	public Raven(){
		this("Edgar", 177, true);
	}
	public Raven(String name, int age, boolean trianed){
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
    	System.out.println(name + " flies onto the owner's shoulder");
    }
	public void trick(){
		if(trained = true){
			System.out.println(name + " sits on the poarch");
		}
		else{
			System.out.println(name + " croaks constantly and scratches the owner's eyes out");
		}
		return;
	}
	
}