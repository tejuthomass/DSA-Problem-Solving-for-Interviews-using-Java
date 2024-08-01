package m2_binary_search;

// 33. Search in Rotated Sorted Array

public class Search {

	public static void main(String[] args) {
		int[] nums = {4, 5, 6, 7, 8, 9, 1, 2, 3};
		int target = 8;
		System.out.print(solution(nums, target));
	}
	
    public static int solution(int[] nums, int target) {
        int minIndex = findMin(nums);
        int ans = Search.binarySearch(nums, 0, minIndex - 1, target);
        if (ans == -1) {
            ans = binarySearch(nums, minIndex, nums.length - 1, target);
        }
        return ans;
    }

    public static int binarySearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int findMin(int[] arr) {
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < arr[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


}
