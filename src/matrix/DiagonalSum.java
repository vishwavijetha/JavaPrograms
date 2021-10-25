package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalSum {

	static void printMatrix(int[][] matrix) {
		for (int[] i : matrix) {
			System.out.println(Arrays.toString(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no. of rows or columns: ");
		int rows = scanner.nextInt();
		System.out.println("Enter the matrix numbers:");
		int firstMatrix[][] = new int[rows][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				firstMatrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Matrix");
		printMatrix(firstMatrix);

		int principal = 0, secondary = 0;
		for (int i = 0; i < rows; i++) {
			principal += firstMatrix[i][i];
			secondary += firstMatrix[i][rows - i - 1];
		}

		System.out.println("Principal Diagonal:" + principal);

		System.out.println("Secondary Diagonal:" + secondary);

		scanner.close();

	}

}
