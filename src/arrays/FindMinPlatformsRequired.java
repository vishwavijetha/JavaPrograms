package arrays;

import java.util.Arrays;

public class FindMinPlatformsRequired {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 100, 140, 150, 200, 415, 400 };
		int dep[] = { 110, 300, 210, 230, 315, 600 };
		Arrays.sort(arr);
		Arrays.sort(dep);
		int i = 0, len = arr.length, platform = 0, minPlatformsRequired = 0;
		while(len !=0) {
			if(arr[i] < dep[i]) {
				platform++;
				if (platform > minPlatformsRequired) {
					minPlatformsRequired = platform;
				}
				
			} else {
				platform--;
			}
			len--;
			i++;
		}
		System.out.println(minPlatformsRequired);

	}

}
