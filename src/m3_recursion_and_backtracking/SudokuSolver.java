package m3_recursion_and_backtracking;

//37. Sudoku Solver

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        
        SudokuSolver.solution(board);
        printBoard(board);
    }
    
    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }
    
    public static void solution(char[][] board) {
        backtrack(board, 0, 0);
    }

    public static boolean backtrack(char[][] board, int x, int y) {
        int n = board.length;
        if (x == n) {
            return true;
        }

        int nx = y == 8 ? x + 1 : x;
        int ny = y == 8 ? 0 : y + 1;

        if (board[x][y] == '.') {
            for (int value = 1; value <= 9; value++) {
                if (canWePlace(board, x, y, value, n) == true) {
                    board[x][y] = (char)(value + '0');
                    if (backtrack(board, nx, ny) == true) {
                        return true;
                    }
                }
                board[x][y] = '.';
            }
        } else {
            if (backtrack(board, nx, ny) == true) {
                return true;
            }
        }

        return false;
    }

    public static boolean canWePlace(char[][] board, int x, int y, int value, int n) {
        for (int col = 0; col < n; col++) {
            if (board[x][col] == (char)(value + '0')) {
                return false;
            }
        }

        for (int row = 0; row < n; row++) {
            if (board[row][y] == (char)(value + '0')) {
                return false;
            }
        }

        x = x - (x % 3);
        y = y - (y % 3);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[x + i][y + j] == (char)(value + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

}
