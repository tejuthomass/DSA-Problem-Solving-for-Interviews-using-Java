package m2_binary_search;

// 153. Find Minimum in Rotated Sorted Array

public class FindMin {

	public static void main(String[] args) {
		int[] arr = {123, 145, 167, 189, 201, 223, 3, 5, 7, 9, 11};
        System.out.print(solution(arr));
	}
	
	public static int solution(int[] arr) {
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < arr[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return arr[left];
    }
}