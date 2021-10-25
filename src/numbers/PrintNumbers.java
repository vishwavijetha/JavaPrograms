package numbers;

import java.util.Arrays;
import java.util.BitSet;

public class PrintNumbers {

	public static void main(String[] args) {

		// 1
		int one = 'A' / 'A';
		for (int i = one; i <= 'd'; i++) {
			System.out.println(i);
		}
		
		print();
		
		// 3
		BitSet bitSet = new BitSet();
		bitSet.set(1,101);
		System.out.println(bitSet);
		
		// 4
		Object num[] = new Object[100];
		Arrays.fill(num, new Object() {
			int count = 1;
			@Override
			public String toString() {
				return Integer.toString(count++);
			}
		});
		System.out.println(Arrays.toString(num));

	}

	// 2
	static int counter = 'A'/'A';

	public static boolean print() {
		if (counter <= 'd') {
			System.out.println(counter);
			counter++;
		} else {
			return true;
		}
		print();
		return false;
	}

}
