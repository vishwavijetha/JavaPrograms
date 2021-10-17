package strings;

public class NonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "repeated character";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.println(c);
				break;
			}
			
		}

	}

}
