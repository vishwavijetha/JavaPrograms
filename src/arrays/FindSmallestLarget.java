package arrays;

public class FindSmallestLarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 2, 100, 70, 56, 7 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("First smallest: " + arr[0]);
		System.out.println("Second smallest: " + arr[1]);
		System.out.println("First largest: " + arr[arr.length - 1]);
		System.out.println("Second largest: " + arr[arr.length - 2]);
	}

}
