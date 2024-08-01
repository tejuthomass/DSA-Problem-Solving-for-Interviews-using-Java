package m3_recursion_and_backtracking;

//51. N-Queens

import java.util.ArrayList;
import java.util.List;

public class NQueens1 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(NQueens1.solution(n));
    }
    
    public static List<List<String>> solution(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        backtrack(board, 0, n, result);
        return result;
    }

    public static boolean isSafe(char[][] board, int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void backtrack(char[][] board, int row, int n, List<List<String>> result) {
        if (row == n) {
            ArrayList<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            result.add(temp);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n) == true) {
                board[row][col] = 'Q';
                backtrack(board, row + 1, n, result);
                board[row][col] = '.';
            }
        }
    }

}
