class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length;

        var rows = new int[m];
        var columns = new int[m];
        var squares = new int[m];

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < m; col++) {
                int cell = board[row][col];
                if (cell == '.') continue;
                int mask = 1 << (cell - '1');
                int squareIdx = row / 3 * 3 + col / 3;

                if ((rows[row] & mask) > 0 || (columns[col] & mask) > 0 || (squares[squareIdx] & mask) > 0)
                    return false;

                rows[row] |= mask;
                columns[col] |= mask;
                squares[squareIdx] |= mask;
            }
        }

        return true;
    }
}
