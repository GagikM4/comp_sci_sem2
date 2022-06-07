package pkg;
import java.util.Scanner;
import java.util.Random;


public class CombinedTable{
	SingleTable t1;
	SingleTable t2;
	
	int seats1;
	int seats2;
	int height1;
	int height2;
	int viewQuality1;
	int viewQuality2;
	int seats = 0;
	int height = 0;
	double viewQuality = 0.0;

	public CombinedTable(){
		this.seats = 0;
		this.height = 0;
		this.viewQuality = 0.0;
	}
	public CombinedTable(SingleTable t1, SingleTable t2){
		this.t1 = t1;
		this.t2 = t2;
	}
	public boolean canSeat(int a, int b){
		if(seats = a + b -2 || seats <= a + b -2){
			return true;
		}
		if(seats > a + b -2){
			return false;
		}
	}
	public double getDesirability(){
		t1.getHeight();
		t2.getHeight();
		if(t1 == t2){
			return (t1.getViewQuality() + t2.getViewQuality())/2;
		}
		if(t1 != t2){
			return (t1.getViewQuality() + t2.getViewQuality())/2 - 10;
		}
	}
}