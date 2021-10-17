package strings;

import java.util.Arrays;

public class CheckAnagramStrings {	

	public static boolean isAnagramUsingStringMethods(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;

		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			int index = str2.indexOf(c);
			// If index of any character is -1, then two strings are not anagrams
			// If index of character is not equal to -1, then remove the character
			if (index != -1) {
				str2 = str2.substring(0, index) + str2.substring(index + 1, str2.length());
			} else
				return false;
		}
		return str2.isEmpty();
	}

	public static boolean isAnagramUsingArraySort(String str1, String str2) {

		String sortedStr1 = sortChars(str1);
		String sortedStr2 = sortChars(str2);

		return sortedStr1.equals(sortedStr2);
	}

	public static String sortChars(String word) {
		char[] wordArr = word.toLowerCase().toCharArray();
		Arrays.sort(wordArr);
		return String.valueOf(wordArr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Apple", str2 = "plpeA";
		System.out.println(isAnagramUsingStringMethods(str1, str2));
		
		System.out.println(isAnagramUsingArraySort(str1, str2));

	}

}
