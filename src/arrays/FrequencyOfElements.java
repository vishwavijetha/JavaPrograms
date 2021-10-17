package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencyOfElements {
	
	public static void main(String[] args) {
		int array[] = {0, 5, 7, 2, 0, 7, 2, 7, 1};
		// 1
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for(int num: array) {
			if (hashMap.containsKey(num)) {
				hashMap.put(num, hashMap.get(num) + 1);
			} else {
				hashMap.put(num, 1);
			}
		}
		for (Entry<Integer, Integer> entry: hashMap.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
		
		// 2
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		Set<Integer> set = new HashSet<>();
		set.addAll(list);
		for(int num: set) {
			System.out.println(num + " ==> " + Collections.frequency(list, num));
		}
		
	}

}
