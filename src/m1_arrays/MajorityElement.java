package m1_arrays;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = {2, 3,4, 5, 6, 7, 8, 9, 0, 2, 2, 2, 2, 2, 2, 2, 2};
		System.out.print(solution(nums));
	}
	
	public static int solution(int[] nums) {
		int candidate = nums[0];
		int count = 1;
		int n = nums.length;
		for (int i = 1; i < n; i++) {
			if (nums[i] == candidate) {
				count++;			
			} else {
				count--;
			}

            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }
		}
		
		count = 0;
		for (int i: nums) {
			if (i == candidate) {
				count++;
			}
			if (count > n / 2) {
				return candidate;
			}
		}
		return -1;	
	}
}
