package m1_arrays;

import java.util.Arrays;

public class SpiralMatrix2 {

	public static void main(String[] args) {
		printMatrix(solution(2));
	}
	
	public static void printMatrix(int[][] mat) {
	    for (int i = 0; i < mat.length; i++) {
	        System.out.println(Arrays.toString(mat[i]));
	    }
	}
	
	public static int[][] solution(int n) {
        int[][] mat = new int[n][n];
	    int rmin = 0, rmax = n - 1;
	    int cmin = 0, cmax = n - 1;
	    int count = 0;
	    
	    while (count < n * n) {
	        for (int col = cmin; col <= cmax && count < n * n; col++) {
	            count++;
	            mat[rmin][col] = count;
	        }
	        rmin++;
	        
	        for (int row = rmin; row <= rmax && count < n * n; row++) {
	            count++;
	            mat[row][cmax] = count;
	        }
	        cmax--;
	        
	        for (int col = cmax; col >= cmin && count < n * n; col--) {
	            count++;
	            mat[rmax][col] = count;
	        }
	        rmax--;
	        
	        for (int row = rmax; row >= rmin && count < n * n; row--) {
	            count++;
	            mat[row][cmin] = count;
	        }
	        cmin++;
	    }
	    
	    return mat;
	}
}
