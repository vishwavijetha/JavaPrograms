package strings;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		
		StringJoiner stringJoiner = new StringJoiner(",", "{", "}");
		stringJoiner.add("Vishwa");
		stringJoiner.add("Vijetha");
		System.out.println(stringJoiner);
		stringJoiner = new StringJoiner(" : ", "[", "]");
		stringJoiner.add("Vishwa");
		stringJoiner.add("Vijetha");
		System.out.println(stringJoiner);

	}

}
