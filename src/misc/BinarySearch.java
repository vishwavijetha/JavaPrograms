package misc;

import java.util.Arrays;

public class BinarySearch {

	public static int[] sort(int[] numbers) {
		if (numbers.length > 1) {
			for (int i = 0; i < numbers.length; i++) {
				for (int j = i + 1; j < numbers.length; j++) {
					if (numbers[i] > numbers[j]) {
						int temp = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = temp;
					}
				}
			}
		}
		System.out.println("Sorted: " + Arrays.toString(numbers));
		return numbers;
	}

	public static int binarySearch(int[] sorted, int key) {
		int mid = sorted.length / 2, low = 0, high = sorted.length - 1;
		while (low <= high) {
			if (key == sorted[mid]) {
				return mid;
			} else if (key < sorted[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
			mid = (low + high) / 2;
		}
		return -1;

	}

	public static void main(String[] args) {

		// Array must be sorted before search
		int[] numbers = { 5, -1, 3, 8, 10, 7, 1 };
		System.out.println("Given: " + Arrays.toString(numbers));
		int sorted[] = sort(numbers);
		// Arrays.sort(numbers);
		System.out.println(binarySearch(sorted, 0));
		System.out.println(binarySearch(sorted, 1));
		System.out.println(binarySearch(sorted, -2));
		System.out.println(binarySearch(sorted, 8));
		System.out.println(binarySearch(sorted, -7));
		System.out.println(binarySearch(sorted, -1));
		System.out.println(binarySearch(sorted, 10));

	}

}
