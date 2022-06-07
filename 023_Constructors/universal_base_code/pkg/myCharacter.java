package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter{
	public String role = new String();
	int a = 0;
	int b = 1;
	int c = 2;
	int d = 3;
	int e = 4;

	public myCharacter() {
		role = "no role";
	}
	public myCharacter(String a){
		role = a;

	}
	public void choice1(){
		if(role.equals("wizard") || role.equals("Wizard") || role.equals("rouge") || role.equals("Rouge") || role.equals("Warrior") || role.equals("warrior")){
		System.out.println("You have chosen " + role + "!" + " Great choice!");
		}
		else{
		role = "no role";
		}
	}
}
	



