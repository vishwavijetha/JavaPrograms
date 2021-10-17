package arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 1, 3, 4, 6 };
		// formula (n*(n+1)/2) - sum(arr)
		int n = arr.length + 1;
		int formula = n * (n + 1) / 2;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int missingNumber = formula - sum;
		System.out.println("Missing number: " + missingNumber);
	}

}
