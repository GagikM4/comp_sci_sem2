package pkg;
import java.util.Scanner;
import java.util.Random;


public class HorseBarn{
	private Horse[] spaces;
	int i;
	public int findHorseSpace(String name){
		for(i = 0; i<spaces.length(); i++){
			if(name.equals(spaces[i])){
				return i;
			}
		}
		i = -1;
		return i;
	}
	
	public void consolidate(){
		String [] x = new String[7];
		int i;
		int b = 0;
		int n = 0;
		int l;
		
		for(i = 0; i<spaces.length; i++){
			if (spaces[i]!= null){
				b++;
			}
		}
		int a = b;
		for(i = 0; i<spaces.length; i++){
			if(spaces[i] != null){
				x[n] = spaces[i];
				n++;
				a--;
				if(a == 0){
					for(l = 0; l<x.length; l++){
						System.out.println(x[l]);
					}
					break;
				}
			}
		}
	}
}
