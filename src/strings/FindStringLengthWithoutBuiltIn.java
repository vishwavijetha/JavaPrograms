package strings;

public class FindStringLengthWithoutBuiltIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
		String str = "Welcome to Java";
		int i = 0;
		try {
			for (i = 0;; i++) {
				str.charAt(i);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Length of String: " + i);

		// 2
		int length = 0;
		char[] strCharArray = str.toCharArray();
		for (char c : strCharArray) {
			length++;
		}
		System.out.println("Length of String: " + length);
	}

}
