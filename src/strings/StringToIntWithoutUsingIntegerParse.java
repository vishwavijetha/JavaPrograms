package strings;

public class StringToIntWithoutUsingIntegerParse {
	
	public static void main(String[] args) {
		
		String str = "1234";
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			num = num * 10 + (int)str.charAt(i) - 48;
		}
		System.out.println(num + 10);
		
	}

}
