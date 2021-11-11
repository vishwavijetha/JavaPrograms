package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RotateMatrix {

	static void printMatrix(int[][] matrix) {
		for (int[] i : matrix) {
			System.out.println(Arrays.toString(i));
		}
		System.out.println();
	}

	static void rotateMatrix(int N, int mat[][]) {
		// Consider all squares one by one
		for (int x = 0; x < N / 2; x++) {
			// Consider elements in group
			// of 4 in current square
			for (int y = x; y < N - x - 1; y++) {
				// Store current cell in
				// temp variable
				int temp = mat[x][y];

				// Move values from right to top
				mat[x][y] = mat[y][N - 1 - x];

				// Move values from bottom to right
				mat[y][N - 1 - x] = mat[N - 1 - x][N - 1 - y];

				// Move values from left to bottom
				mat[N - 1 - x][N - 1 - y] = mat[N - 1 - y][x];

				// Assign temp to left
				mat[N - 1 - y][x] = temp;
			}
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int rows = scanner.nextInt();
		System.out.println("Enter no. of columns: ");
		int cols = scanner.nextInt();
		int matrix[][] = new int[rows][cols];
		System.out.println("Enter matrix elements: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Original Matrix: ");
		printMatrix(matrix);

		System.out.println("\n\n Rotated Matrix: ");
		rotateMatrix(Math.max(rows, cols), matrix);
		printMatrix(matrix);

		scanner.close();
	}

}
