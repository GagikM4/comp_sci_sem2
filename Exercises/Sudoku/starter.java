import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
    public void setBoardNumbers(double[][] board){
        int i;
        int l;
		for(i = 0; i<board.length; i++){
			for(l = 0; l<board[i].length; l++){
				double rand1 = Math.round(Math.random()*9);
				board[i][l] = rand1;
				System.out.print(board[i][l] + " ");
			}
		}
		return;
	}
	
	
	public static void main(String args[]) {

	double[][] board1 = new double[3][3];
	int[][] board2 = new int[3][3];
	int[][] board3 = new int[3][3];
	int[][] board4 = new int[3][3];
	int[][] board5 = new int[3][3];
	int[][] board6 = new int[3][3];
	int[][] board7 = new int[3][3];
	int[][] board8 = new int[3][3];
	int[][] board9 = new int[3][3];
	board1.setBoardNumbers();
    }
}
