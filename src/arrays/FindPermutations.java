package arrays;

public class FindPermutations {

	public static int[] swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

	public static void geneneratePermutation(int arr[], int start, int end) {
		if (start == end - 1) {
			for (int num : arr)
				System.out.print(num);
			System.out.println();
		} else {
			for (int i = start; i < end; i++) {
				// Swapping the array by fixing a number
				arr = swap(arr, start, i);
				// Recursively calling function generatePermutation() for rest of the characters
				geneneratePermutation(arr, start + 1, end);
				// Backtracking and swapping the numbers again.
				arr = swap(arr, start, i);
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		geneneratePermutation(arr, 0, arr.length);

	}

}
