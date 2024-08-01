package m3_recursion_and_backtracking;

import java.util.ArrayList;
import java.util.List;

//46. Permutations

public class Permutations {
 public static List<List<Integer>> permute(int[] nums) {
     List<List<Integer>> result = new ArrayList<>();
     backtrack(nums, 0, new boolean[nums.length], new ArrayList<>(), result);
     return result;
 }

 public static void backtrack(int[] nums, int pos, boolean[] selected, ArrayList<Integer> ans, List<List<Integer>> result) {
     if (pos == nums.length) {
         result.add(new ArrayList<>(ans));
         return;
     }

     for (int i = 0; i < nums.length; i++) {
         if (selected[i] == false) {
             selected[i] = true;
             ans.add(nums[i]);
             backtrack(nums, pos + 1, selected, ans, result);
             selected[i] = false;
             ans.remove(ans.size() - 1);
         }
     }
 }
 
 public static void main(String[] args) {
     int[] nums = {1,2,3};
     System.out.println(permute(nums));
     }
}