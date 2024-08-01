package m1_arrays;

import java.util.HashMap;

public class TwoSum {
	public static int[] solution(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = target - nums[i];
            if (map.containsKey(n)) {
                ans[0] = map.get(n);
                ans[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{11, 3, 7, 9, 14, 4};
        int target = 17;
        int ans[] = solution(nums, target);
        System.out.print(ans[0] + " " + ans[1]);        
    }
}