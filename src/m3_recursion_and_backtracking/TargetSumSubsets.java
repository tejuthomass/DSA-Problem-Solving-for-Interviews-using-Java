package m3_recursion_and_backtracking;

import java.util.ArrayList;
import java.util.List;

public class TargetSumSubsets {
	public static void main(String[] args) {
	    int[] arr = {10, 20, 30, 40, 50};
	    int target = 60;
	    List<List<Integer>> result = new ArrayList<>();
	    solution(arr, 0, target, new ArrayList<>(), result);
	    System.out.println(result);
	}
	
	public static void solution(int[] arr, int i, int target, ArrayList<Integer> ans, List<List<Integer>> result) {
	    if (i == arr.length || target < 0) {
	        if (target == 0) {
	            result.add(new ArrayList<>(ans));
	        }
	        return;
	    }
	    
	    ans.add(arr[i]);
	    solution(arr, i + 1, target - arr[i], ans, result);
	    ans.remove(ans.size() - 1);
	    
	    solution(arr, i + 1, target, ans, result);
	}
}
