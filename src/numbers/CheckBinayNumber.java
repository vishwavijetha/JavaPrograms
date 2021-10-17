package numbers;

public class CheckBinayNumber {

	static boolean isBinaryNumber(int num) {
		while (num != 0) {
			if (num % 10 > 1)
				return false;
			else
				num = num / 10;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1010, num2 = 1002;
		System.out.println(isBinaryNumber(num1));
		System.out.println(isBinaryNumber(num2));

	}

}
