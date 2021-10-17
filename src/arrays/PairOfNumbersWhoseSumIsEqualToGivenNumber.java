package arrays;

public class PairOfNumbersWhoseSumIsEqualToGivenNumber {

	public static void main(String[] args) {

		int array[] = { -40, -5, 1, 3, 6, 7, 8, 20 };
		int number = 20;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int sum = array[i] + array[j];
				if (Math.abs(sum) == number) {
					System.out.println("Pair of numbers whose sum equals the given number " + number + " are "
							+ array[i] + ", " + array[j]);
				}
			}
		}
	}

}
