package m3_recursion_and_backtracking;

//90. Subsets II

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subsets2 {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.print(subsetsWithDup(nums));
	}
    
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        backtrack(nums, 0, new ArrayList<>(), result);
        return new ArrayList<>(result);
    }

    public static void backtrack(int[] arr, int i, ArrayList<Integer> ans, Set<List<Integer>> result) {
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
