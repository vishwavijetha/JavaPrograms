package patterns;

public class StarPattern1 {

	public static void main(String[] args) {

		int length = 10;
		for (int i = 0; i < length; i++) {
			for (int j = length; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
