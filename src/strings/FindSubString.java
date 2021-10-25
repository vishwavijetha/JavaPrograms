package strings;

public class FindSubString {
	
	static boolean isSubString(String str, String sub) {
		return str.matches("(.*)" + sub + "(.*)");
	}

	public static void main(String[] args) {
		
		String str = "This is Java Program to find substring is present or not";
		System.out.println(isSubString(str, str));
		System.out.println(isSubString(str, null));
		System.out.println(isSubString(str, " "));
		System.out.println(isSubString(str, "fin"));
		System.out.println(isSubString(str, "is p"));
		System.out.println(isSubString(str, "his"));
		System.out.println(isSubString(str, "java"));

	}

}
