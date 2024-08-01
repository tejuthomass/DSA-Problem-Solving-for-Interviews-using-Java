package m1_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix1
{
	public static void main(String[] args) {
	    int[][] mat = {
	        {1, 2, 3},
	        {4, 5, 6},
	        {7, 8, 9}
	    };
	    
//		printMatrix(mat);
		
		printResult(solution(mat));
	}
	
	public static void printMatrix(int[][] mat) {
	    for (int i = 0; i < mat.length; i++) {
	        System.out.println(Arrays.toString(mat[i]));
	    }
	}
	
	public static void printResult(List<Integer> mat) {
	    System.out.println(mat);
	}
	
	public static List<Integer> solution(int[][] mat) {
	    int n = mat.length;
	    int m = mat[0].length;
	    int rmin = 0, rmax = mat.length - 1;
	    int cmin = 0, cmax = mat[0].length - 1;
	    int count = 0;
	    List<Integer> ans = new ArrayList<>();
	    
	    while (count < n * m) {
	        for (int col = cmin; col <= cmax && count < n * m; col++) {
	            ans.add(mat[rmin][col]);
	            count++;
	        }
	        rmin++;
	        
	        for (int row = rmin; row <= rmax && count < n * m; row++) {
	            ans.add(mat[row][cmax]);
	            count++;
	        }
	        cmax--;
	        
	        for (int col = cmax; col >= cmin && count < n * m; col--) {
	            ans.add(mat[rmax][col]);
	            count++;
	        }
	        rmax--;
	        
	        for (int row = rmax; row >= rmin && count < n * m; row--) {
	            ans.add(mat[row][cmin]);
	            count++;
	        }
	        cmin++;
	    }
	    
	    return ans;

	}
}