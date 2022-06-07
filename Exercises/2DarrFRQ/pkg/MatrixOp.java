package pkg;
import java.util.Scanner;
import java.util.Random;


public  class MatrixOp {
	public static int diagonalOp(int[][] matA, int[][] matB){
		int sum = 0;
		for(int b = 0; b<matA.length; b++){
			int prod1 = matA[b][b] * matB[b][b];
//			int prod2 = prod1;
			sum = sum + prod1;
		//	System.out.println(sum);
		}
					System.out.println(sum);
		return sum;
	}

}

