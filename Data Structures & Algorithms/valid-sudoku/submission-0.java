class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        var rows = new HashMap<Integer, Set<Character>>();
        var columns = new HashMap<Integer, Set<Character>>();
        var squares = new HashMap<Integer, Set<Character>>();

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                char cell = board[row][col];
                if (cell == '.') continue;
                if (
                        !rows.computeIfAbsent(row, k -> new HashSet<>()).add(cell) ||
                        !columns.computeIfAbsent(col, k -> new HashSet<>()).add(cell) ||
                        !squares.computeIfAbsent(row / 3 * 3 + col / 3, k -> new HashSet<>()).add(cell)
                ) return false;
            }
        }

        return true;
    }
}
