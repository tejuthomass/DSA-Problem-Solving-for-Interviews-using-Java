package m1_arrays;

import java.util.Arrays;

public class RotateImage {
	public static void main(String[] args) {
	    int[][] mat = {
	        {1, 2, 3},
	        {4, 5, 6},
	        {7, 8, 9}
	    };
	    solution(mat);
		printMatrix(mat);
	}
	
	public static void printMatrix(int[][] mat) {
	    for (int i = 0; i < mat.length; i++) {
	        System.out.println(Arrays.toString(mat[i]));
	    }
	}
	
	public static void solution(int[][] mat) {
	    for (int i = 0; i < mat.length; i++) {
	        for (int j = i + 1; j < mat[0].length; j++) {
	            int temp = mat[i][j];
	            mat[i][j] = mat[j][i];
	            mat[j][i] = temp;
	        }
	    }
	    
	    int left = 0, right = mat[0].length - 1;
	    while (left < right) {
	        for (int i = 0; i < mat.length; i++) {
	            int temp = mat[i][left];
	            mat[i][left] = mat[i][right];
	            mat[i][right] = temp;
	        }
	        left++;
	        right--;
	    }

	}
}
