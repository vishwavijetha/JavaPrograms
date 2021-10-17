package strings;

public class FindAllPossiblePermutationsOfString {

	// n!
	public static String swap(String str, int i, int j) {
		char[] cArray = str.toCharArray();
		char c = cArray[i];
		cArray[i] = cArray[j];
		cArray[j] = c;
		return String.valueOf(cArray);
	}

	public static void generatePermutation(String str, int start, int end) {
		// Prints the permutations
		if (start == end - 1)
			System.out.println(str);
		else {
			for (int i = start; i < end; i++) {
				// Swapping the string by fixing a character
				str = swap(str, start, i);
				// Recursively calling function generatePermutation() for rest of the characters
				generatePermutation(str, start + 1, end);
				// Backtracking and swapping the characters again.
				str = swap(str, start, i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Vishwa";
		generatePermutation(str, 0, str.length());

	}

}
