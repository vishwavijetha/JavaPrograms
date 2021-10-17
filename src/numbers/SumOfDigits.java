package numbers;

public class SumOfDigits {

	public static void main(String[] args) {
		int number = 123456, sum = 0;
		String str = number + "";
		// 1
		for (int i = 0; i < str.length(); i++) {
			sum = sum + Integer.parseInt(str.charAt(i) + "");
		}
		System.out.println(sum);
		// 2
		sum = 0;
		while (number > 0) {
			sum = sum + (number % 10);
			number = number / 10;
		}
		System.out.println(sum);
	}
}
