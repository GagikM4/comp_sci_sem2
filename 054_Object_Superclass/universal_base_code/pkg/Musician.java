package pkg;
import java.util.Scanner;
import java.util.Random;


public class Musician extends Performer{
	String instrument;
	
	public Musician() {
		super();
		instrument = "Cello";
	}
	public Musician(String instrument){
		this.instrument = instrument;
	}
	public Musician(String name, String instrument){
		super(name);
		this.name = name;
		this.instrument = instrument;
	}
	public Musician(String name, int age){
		super(name, age);
		this.name = name;
		this.age = age;
	}
	public Musician(String name, int age, String instrument){
		super(name, age);
		this.name = name;
		this.age = age;
		this.instrument = instrument;
	}
	public String getInstrument(){
		return instrument;
	}
	public void playInstrument(){
		System.out.println(instrument + " is being played");
		return;
	}
	public String toString(){
		return ("Name: " + name + " Instrument: " + instrument);
	}
}