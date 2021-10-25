package numbers;

public class ArmStrongNumber {

	public static boolean isArmStrongNumber(int num) {
		if (num >= 0 && num <= 9)
			return true;

		if (num < 0)
			return false;

		int noOfDigits = String.valueOf(num).length();
		int copy = num;
		int sum = 0;
		while (copy != 0) {
			int lastDigit = copy % 10;
			int factor = 1;
			for (int i = 0; i < noOfDigits; i++) {
				factor = factor * lastDigit;
			}
			sum = sum + factor;
			copy = copy / 10;
		}

		if (sum == num)
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isArmStrongNumber(0));
		System.out.println(isArmStrongNumber(9));
		System.out.println(isArmStrongNumber(153));
		System.out.println(isArmStrongNumber(123));
		// Can use this as well for solution
		System.out.println(Math.pow(2, 3));
	}

}
