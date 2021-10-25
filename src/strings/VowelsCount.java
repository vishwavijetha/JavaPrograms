package strings;

public class VowelsCount {

	public static void main(String[] args) {
		
		String str = "Hi Hello and Welcome to Java";
		int count = 0;
		for(char c: str.toCharArray()) {
			switch(c) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				count++;
				break;
			default:
				break;
			}
		}
		System.out.println("Count of vowels: " + count);

	}

}
