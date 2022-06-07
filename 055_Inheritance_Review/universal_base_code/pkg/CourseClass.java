package pkg;
import java.util.Scanner;
import java.util.Random;


public class CourseClass {
	String teacher;
	int grade;
	int credit;
	
	public CourseClass() {
		this("Mr. Poole", 100, 4);
	}
	public CourseClass(int credit){
		this.teacher = "";
		this.grade = 0;
		this.credit = credit;
	}
	public CourseClass(String teacher, int grade){
		this.teacher = teacher;
		this.grade = grade;
		this.credit = 0;
	}
	public CourseClass(String teacher, int grade, int credit){
		this.teacher = teacher;
		this.grade = grade;
		this.credit = credit;
	}
	public int calcCredit(int credit){
		if(grade >= 90 || grade == 90){
			credit = 4;
			return credit;
		}
		if(grade >= 80 || grade == 80){
			credit = 3;
			return credit;
		}
		if(grade >= 70 || grade == 70){
			credit = 2;
			return credit;
		}
		if(grade >= 60 || grade == 60){
			credit = 1;
			return credit;
		}
		if(grade <= 60){
			credit = 0;
			return credit;
		}
		return credit;
	}
	public String toString(){
		return ("Teacher: " + teacher + " Credit: " + credit);
	}
	public boolean equals(Object other){
		return this.teacher == teacher;
	}
}

