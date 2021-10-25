package numbers;

public class NaN {

	public static void main(String[] args) {
		
		// Arithmetic Exception only for Integers 
		// System.out.println(1/0);
		System.out.println(0/1);
		System.out.println(1.0/0.0);
		System.out.println(1.0/0);
		System.out.println(0.0/0.0);
		System.out.println(0/0.0);
		System.out.println(Math.sqrt(-1));
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Float.MIN_VALUE);
	}

}
