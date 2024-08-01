package m3_recursion_and_backtracking;

//78. Subsets

import java.util.ArrayList;
import java.util.List;

public class Subsets1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.print(solution(nums));
	}
    
    public static List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    public static void backtrack(int[] arr, int i, ArrayList<Integer> ans, List<List<Integer>> result) {
        if (i == arr.length) {
            result.add(new ArrayList<>(ans));
            return;
        }
        
        ans.add(arr[i]);
        backtrack(arr, i + 1, ans, result);
        ans.remove(ans.size() - 1);
        
        backtrack(arr, i + 1, ans, result);
    }
}
