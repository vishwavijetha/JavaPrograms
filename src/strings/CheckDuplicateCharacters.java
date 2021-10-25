package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckDuplicateCharacters {

	public static void main(String[] args) {
		
		// O(n2)
		String str = "Vishwa Vijetha";
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (Character c : map.keySet()) {
			if (map.get(c) > 1)
				System.out.println("duplicate character : " + c + " ====== " + " count : " + map.get(c));
		}
		
		// O(n)
		char[] cArray = str.toCharArray();
		Set<Character> set = new HashSet<>();
		for(char c: cArray) {
			if (!set.add(c)) {
				System.out.println(c);
			}
		}
	}

}
