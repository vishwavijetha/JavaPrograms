package numbers;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

	static int num1 = 0, num2 = 1, sum = 0, counter = 1;
	static List<Integer> fibonacciList = new ArrayList<>();

	public static void fibonacci(int length) {
		if (length > 2) {
			int sum = num1 + num2;
			fibonacciList.add(sum);
			num1 = num2;
			num2 = sum;
			fibonacci(length - 1);
		} else {
			fibonacciList.add(0, 0);
			fibonacciList.add(1, 1);
			System.out.println(fibonacciList);
		}
	}

	public static void main(String[] args) {
		fibonacci(15);
	}

}
