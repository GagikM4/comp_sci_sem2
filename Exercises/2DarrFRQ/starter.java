import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [][] matA = new int[3][3];
		int [][] matB = new int[3][3];
		Random rand = new Random();
		for(int x = 0; x<matA.length; x++){
			for(int y = 0; y<matA[0].length; y++){
				int a = rand.nextInt(10);
				matA[x][y] = a;
				System.out.print(matA[x][y] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		for(int x = 0; x<matB.length; x++){
			for(int y = 0; y<matB[0].length; y++){
				int a = rand.nextInt(10);
				matB[x][y] = a;
				System.out.print(matB[x][y] + " ");
			}
			System.out.println("");
		}
		System.out.println(MatrixOp.diagonalOp(matA, matB));
	}
}
