package numbers;

public class Palindrome {

	public static boolean isPalindrome(int num) {
		int remainder = 0, reverse = 0, original = num;
		while (num > 0) {
			remainder = num % 10;
			num = num / 10;
			reverse = (reverse * 10) + remainder;
		}
		return original == reverse;
	}

	public static void main(String[] args) {
		int num1 = 1221, num2 = 1231, num3 = 16461;
		System.out.println(isPalindrome(num1));
		System.out.println(isPalindrome(num2));
		System.out.println(isPalindrome(num3));
	}

}
