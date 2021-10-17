package arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindNonRepeatedElement {

	public static void main(String[] args) {
		
		int arr[]={14, 12, 14, 15, 99, 12, 21, 90};
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for(int num: arr) {
			if(map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
		}
		for(Entry<Integer, Integer> entry: map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("First non repeated element: " + entry.getKey());
				break;
			}
		}
		

	}

}
