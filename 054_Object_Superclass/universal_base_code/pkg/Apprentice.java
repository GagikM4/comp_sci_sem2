package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician {
	String school;
	int yearsOfExperience;

	public Apprentice() {
		this.school = "CVHS";
		this.yearsOfExperience = 0;
	}
	public Apprentice(String school, int yearsOfExperience){
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	public Apprentice(String instrument, String school, int yearsOfExperience){
		super(instrument);
		this.instrument = instrument;
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	public Apprentice(String name, int age, String instrument, String school, int yearsOfExperience){
		super(name, age);
		this.name = name;
		this.age = age;
		this.instrument = instrument;
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	public void playInstrument(){
		System.out.println(instrument + " is being polished");
		return;
	}
	public void practice(){
		System.out.println(name + " has " + yearsOfExperience + " years of experience");
		return;
	}
	public void perform(){
		System.out.println(name + " is excited to perform!");
		return;
	}
	public void practiceAtUniversity(){
		System.out.println(name + " is practicing at " + school);
		return;
	}
	public String toString(){
		return ("Name: " + name  + " Instrument: " + instrument + " University: " + school);
	}
}