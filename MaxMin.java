package week1.day3;

import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		int[] nums={22,987,998,-90,0,78,89};
		Arrays.sort(nums);	
		System.out.println("The minimum number of this array is "+nums[0]);
		System.out.println("The maximum value is "+nums[nums.length-1]);
		for (int i = 0; i <nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}