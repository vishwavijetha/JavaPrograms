package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Transpose {

	static void printMatrix(int[][] matrix) {
		for (int[] i : matrix) {
			System.out.println(Arrays.toString(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int rows = scanner.nextInt();
		System.out.println("Enter no. of columns: ");
		int cols = scanner.nextInt();
		System.out.println("Enter the matrix numbers:");
		int firstMatrix[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				firstMatrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Matrix");
		printMatrix(firstMatrix);

		int[][] transpose = new int[cols][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transpose[j][i] = firstMatrix[i][j];
			}
		}

		System.out.println("Transpose: ");
		printMatrix(transpose);

		scanner.close();

	}

}
