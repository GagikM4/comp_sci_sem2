package pkg;
import java.util.Scanner;
import java.util.Random;


public class Actor extends Performer {
	private String type;
	
	public Actor(){
		type = "theater";
	}
	public Actor(String name, String type){
		this.name = name;
		this.type = type;
	}
	public void practice(){
		System.out.println(name + " doesn't want to practice");
		return;
	}
	public void perform(){
		System.out.println(name + " doesn't want to perform");
		return;
	}
	public void monologue(){
		System.out.println("\"Have you seen what it’s like out there, Murray? Do you ever actually leave this studio? Everybody just yells and screams at each other\"");
		return;
	}

}

