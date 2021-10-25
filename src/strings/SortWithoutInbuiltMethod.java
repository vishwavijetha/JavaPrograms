package strings;

import java.util.Arrays;

public class SortWithoutInbuiltMethod {

	public static void main(String[] args) {

		String[] strArray = { "ball", "BALL", "cat", "Apple", "123" };
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i].compareTo(strArray[j]) > 0) {
					String temp = strArray[i];
					strArray[i] = strArray[j];
					strArray[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(strArray));
	}

}
