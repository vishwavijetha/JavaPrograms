package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Multiplication {

	static void printMatrix(int[][] matrix) {
		for (int[] i : matrix) {
			System.out.println(Arrays.toString(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("<<<<matrix multiplication>>>>");
		System.out.println("Enter no. of rows for matrix 1: ");
		int rows1 = scanner.nextInt();
		System.out.println("Enter no. of columns for matrix 1 or rows for matrix 2: ");
		int rowsInSecondOrColsinFirst = scanner.nextInt();
		System.out.println("Enter no. of columns for matrix 2:");
		int cols2 = scanner.nextInt();
		System.out.println("Enter the first matrix numbers:");
		int firstMatrix[][] = new int[rows1][rowsInSecondOrColsinFirst];
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < rowsInSecondOrColsinFirst; j++) {
				firstMatrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Enter the second matrix numbers:");
		int secondMatrix[][] = new int[rowsInSecondOrColsinFirst][cols2];
		for (int i = 0; i < rowsInSecondOrColsinFirst; i++) {
			for (int j = 0; j < cols2; j++) {
				secondMatrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Matrix 1");
		printMatrix(firstMatrix);

		System.out.println("Matrix 2");
		printMatrix(secondMatrix);

		int[][] result = new int[rows1][cols2];
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols2; j++) {
				for (int k = 0; k < rowsInSecondOrColsinFirst; k++) {
					result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
				}
			}
		}

		System.out.println("Result: ");
		printMatrix(result);

		scanner.close();

	}

}
