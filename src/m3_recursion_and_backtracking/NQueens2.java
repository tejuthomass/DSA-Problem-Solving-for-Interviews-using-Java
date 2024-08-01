package m3_recursion_and_backtracking;

//52. N-Queens II

public class NQueens2 {
    private int count;
    
    public static void main(String[] args) {
        int n = 8;
        System.out.println(NQueens2.solution(n));
    }

    public static int solution(int n) {
    	NQueens2 c = new NQueens2();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        backtrack(board, 0, n, new boolean[n], new boolean[2 * n - 1], new boolean[2 * n - 1], c);

        return c.count;
    }

    public static void backtrack(char[][] board, int row, int n, boolean cols[], boolean[] d1, boolean[] d2, NQueens2 c) {
        if (row == n) {
            c.count += 1;
        }
        for (int col = 0; col < n; col++) {
            if (cols[col] == false && d1[row + col] == false && d2[row - col + n - 1] == false) {
                board[row][col] = 'Q';
                cols[col] = true;
                d1[row + col] = true;
                d2[row - col + n - 1] = true;
                backtrack(board, row + 1, n, cols, d1, d2, c);
                board[row][col] = '.';
                cols[col] = false;
                d1[row + col] = false;
                d2[row - col + n - 1] = false;
            }
        }
    }

}
