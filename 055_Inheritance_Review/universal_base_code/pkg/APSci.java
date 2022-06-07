package pkg;
import java.util.Scanner;
import java.util.Random;


public class APSci extends Science{

	public APSci() {
		grade = 100;
		credit = 5;
	}
	public APSci(int grade, int credit){
		super(credit);
		this.grade = grade;
		this.credit = credit;
	}
	public int calcCredit(int credit){
		if(grade >= 90 || grade == 90){
			credit = 5;
			return credit;
		}
		if(grade >= 80 || grade == 80){
			credit = 4;
			return credit;
		}
		if(grade >= 70 || grade == 70){
			credit = 3;
			return credit;
		}
		if(grade >= 60 || grade == 60){
			credit = 2;
			return credit;
		}
		if(grade <= 60){
			credit = 1;
			return credit;
		}
		return credit;
	}

}

