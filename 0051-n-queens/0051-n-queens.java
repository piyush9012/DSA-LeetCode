class Solution {
    public void solve(int col, char board[][], int leftRow[], int upperDiagonal[], int lowerDiagonal[], List<List<String>> ans){
        if(col == board.length){
            ans.add(construct(board));
            return;
        }
        for(int row = 0; row < board.length; row++){
            if(leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[board.length - 1 + col - row] == 0){
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[board.length - 1 + col - row] = 1;
                solve(col+1, board, leftRow, upperDiagonal, lowerDiagonal, ans);
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[board.length - 1 + col - row] = 0;
            }
        }
    }

    public List < String > construct(char[][] board) {
        List < String > ans = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            ans.add(s);
        }
        return ans;
    }

    public List<List<String>> solveNQueens(int n) {
        char board[][] = new char[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        int leftRow[] = new int[n];
        int upperDiagonal[] = new int[2*n - 1];
        int lowerDiagonal[] = new int[2*n - 1];
        solve(0, board, leftRow, upperDiagonal, lowerDiagonal, ans);
        return ans;
    }
}