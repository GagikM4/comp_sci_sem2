package pkg;
import java.util.Scanner;
import java.util.Random;


public class RecoverySci extends Science {
	
	
	public RecoverySci() {
		grade = 100;
	}
	public RecoverySci(int grade, int credit){
		super(credit);
		this.grade = grade;
		this.credit = credit;
	}
	public int passFail(int credit){
		if(grade >= 60 || grade == 60){
			System.out.println("Pass");
			return 4;
		}
		if(grade <= 60){
			System.out.println("Fail");
			return 0;
		}
		return credit;
	}

}

