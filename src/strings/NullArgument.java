package strings;

public class NullArgument {
	
	static public void test(Object o) {
		System.out.println("Object method called");
	}
	
	static public void test(String s) {
		System.out.println("String method called");
	}

	public static void main(String[] args) {
		test(null);
	}

}
