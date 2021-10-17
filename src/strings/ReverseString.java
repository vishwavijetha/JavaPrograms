package strings;

public class ReverseString {

	// recursion
	public static String reverse(String str) {
		if (str.length() == 1)
			return str;
		else
			return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Vishwa";
		String reverse = "";

		// 1
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
		
		// 2
		System.out.println(reverse(str));
		
		// 3
		StringBuffer stringBuffer = new StringBuffer(str);
		System.out.println(stringBuffer.reverse());
	}

}
