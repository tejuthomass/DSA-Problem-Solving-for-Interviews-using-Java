package m2_binary_search;

import java.util.Arrays;

public class FirstAndLastPosition {
	    
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
		print(solution(nums, target));
	}
	
	public static void print(int[] nums) {
	    System.out.println(Arrays.toString(nums));
	}

    
    public static int[] solution(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int[] res = new int[]{-1, -1};
        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                res[0] = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                res[1] = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
}
