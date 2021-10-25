package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Add {

	static void printMatrix(int[][] matrix) {
		for (int[] i : matrix) {
			System.out.println(Arrays.toString(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("<<<<matrix addition>>>>");
		System.out.println("Enter no. of rows: ");
		int rows = scanner.nextInt();
		System.out.println("Enter no. of columns: ");
		int cols = scanner.nextInt();
		System.out.println("Enter the first matrix numbers:");
		int firstMatrix[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				firstMatrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Enter the second matrix numbers:");
		int secondMatrix[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				secondMatrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Matrix 1");
		printMatrix(firstMatrix);

		System.out.println("Matrix 2");
		printMatrix(secondMatrix);

		int[][] result = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
			}
		}

		System.out.println("Result: ");
		printMatrix(result);
		
		scanner.close();

	}

}
