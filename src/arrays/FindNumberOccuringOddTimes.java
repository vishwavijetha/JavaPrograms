package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindNumberOccuringOddTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = { 20, 1, 20, 3, 5, 1, 5 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : numbers) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}
		System.out.println("Numbers occuring odd number of times:");
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() % 2 == 1) {
				System.out.println(entry.getKey() + " --> " + entry.getValue() + " times");
			}
		}
	}

}
