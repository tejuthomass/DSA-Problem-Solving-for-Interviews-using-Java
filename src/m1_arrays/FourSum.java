package m1_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {
		int[] nums = {2, 2, 2, 2, 2};
		int target = 8;
		System.out.print(solution(nums, target));
	}
	
	public static List<List<Integer>> solution(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		int length = nums.length;
		
		for (int i = 0; i < length; i++) {
		    if (i == 0 || (nums[i] != nums[i - 1])) {
    		    for (int j = i + 1; j < length; j++) {
    		        if (j == i + 1 || nums[j] != nums[j - 1]) {
        		        int left = j + 1;
        		        int right = length - 1;
        		        
        		        while (left < right) {
                            long total = (long) nums[i] + (long) nums[j] + (long) nums[left] + (long) nums[right];
        					if (total == target) {
        						result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
        						
        						while (left < right && nums[left] == nums[left + 1]) {
        							left++;
        						}
        						while (left < right && nums[right] == nums[right - 1]) {
        							right--;
        						}
        						left++;
        						right--;
        					} else if (total < target) {
        						left++;
        					} else {
        						right--;
        					}
        				}
    		        }
    		    }
		    }
		}
		
		return result;
		
	}

}
