package arrays;

public class FindPairWhoseSumIsCloseToZero {
	public static void main(String[] args) {
		int arr[] = { -4, 20, 10, 5, -6, -1, 0, 7, 8, -10 };
		int minSum = arr[0] + arr[1];
		int index1 = 0, index2 = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tempSum = arr[i] + arr[j];
				if (Math.abs(tempSum) < Math.abs(minSum)) {
					minSum = tempSum;
					index1 = i;
					index2 = j;
				}
			}
		}
		System.out.println("PairWhoseSumIsCloseToZero: " + arr[index1] + ", " + arr[index2]);
	}
}
