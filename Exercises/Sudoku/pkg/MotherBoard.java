package pkg;
import java.util.Scanner;
import java.util.Random;


public class MotherBoard {
	int i;
	
	public void setBoardNumbers(int[][] board){
		for(i = 0; i<board.length; i++){
			for(l = 0; l<board[i]; l++){
				int rand1 = Math.round(Math.random()*9);
				board[i][l] = rand1;
				System.out.print(board[i][l] + " ");
			}
		}
	}

}
