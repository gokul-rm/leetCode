public class Solution {

    private HashSet<Integer>[] rows;
    private HashSet<Integer>[] cols;
    private HashSet<Integer>[] boxes;

    public void solveSudoku(char[][] board) {
        rows = new HashSet[9];
        cols = new HashSet[9];
        boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    rows[i].add(num);
                    cols[j].add(num);
                    boxes[getBoxIndex(i, j)].add(num);
                }
            }
        }

        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (int num = 0; num < 9; num++) {
                        if (isValid(i, j, num)) {
                            board[i][j] = (char) ('1' + num);
                            rows[i].add(num);
                            cols[j].add(num);
                            boxes[getBoxIndex(i, j)].add(num);

                            if (solve(board)) return true;

                            board[i][j] = '.';
                            rows[i].remove(num);
                            cols[j].remove(num);
                            boxes[getBoxIndex(i, j)].remove(num);
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(int row, int col, int num) {
        return !rows[row].contains(num) && !cols[col].contains(num) && !boxes[getBoxIndex(row, col)].contains(num);
    }

    private int getBoxIndex(int row, int col) {
        return (row / 3) * 3 + col / 3;
    }
}
