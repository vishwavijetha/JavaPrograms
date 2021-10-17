package patterns;

public class AlphaPattern2 {

	public static void main(String[] args) {

		int length = 10;
		char c = 65;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (c) + " ");
			}
			c++;
			System.out.println();
		}

	}

}
