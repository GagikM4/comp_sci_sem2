package pkg;
import java.util.Scanner;
import java.util.Random;


public class Science extends CourseClass {
	String field;
	
	public Science() {
		field = "";
	}
	public Science(int credit){
		super(credit);
		this.field = "";
		this.credit = credit;
	}
	public Science(String field, int credit){
		super(credit);
		this.field = field;
		this.credit = credit;
	}
//	public String toString(){
//		return teacher;
//	}
}

