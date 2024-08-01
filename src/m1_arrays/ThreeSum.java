package m1_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		int target = 0;
		System.out.print(solution(nums, target, nums.length));
	}
	
	public static List<List<Integer>> solution(int[] nums, int target, int length) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		
		for (int i = 0; i < length; i++) {
			if (i == 0 || (nums[i] != nums[i - 1])) {
				int j = i + 1;
				int k = length - 1;
				int newTarget = target - nums[i];
				
				while (j < k) {
					if (nums[j] + nums[k] == newTarget) {
						result.add(Arrays.asList(nums[i], nums[j], nums[k]));
						
						while (j < k && nums[j] == nums[j + 1]) {
							j++;
						}
						while (j < k && nums[k] == nums[k - 1]) {
							k--;
						}
						j++;
						k--;
					} else if (nums[j] + nums[k] < newTarget) {
						j++;
					} else {
						k--;
					}
				}
			}
		}
		
		return result;
	}

}
