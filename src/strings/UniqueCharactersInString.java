package strings;

import java.util.HashSet;

public class UniqueCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1
		String str1 = "apple", str2 = "vishwa";
		boolean isUnique = false;
		HashSet<Character> hashSet = new HashSet<>();
		char[] cArray = str1.toCharArray();
		for (char c: cArray) {
			if (hashSet.add(c)) {
				isUnique = true;
			} else {
				isUnique = false;
				break;
			}
		}
		System.out.println(str1 + " is having unique characters?: " + isUnique);
		
		hashSet = new HashSet<>();
		cArray = str2.toCharArray();
		for (char c: cArray) {
			if (hashSet.add(c)) {
				isUnique = true;
			} else {
				isUnique = false;
				break;
			}
		}
		System.out.println(str2 + " is having unique characters?: " + isUnique);
		
		// 2
		for (int i=0;i<str1.length(); i++) {
			char c = str1.charAt(i);
			if (str1.indexOf(c) != str1.lastIndexOf(c)) {
				isUnique = false;
				break;
			} else {
				isUnique = true;
			}
		}
		System.out.println(str1 + " is having unique characters?: " + isUnique);

	}

}
