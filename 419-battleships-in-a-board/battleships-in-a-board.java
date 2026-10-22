
class Solution {
    public int countBattleships(char[][] board) {
        int[][] vis = new int[board.length][board[0].length];
        int count = 0;

        int[][] directions = {
                { -1, 0 },
                { 0, -1 },
                { 1, 0 },
                { 0, 1 }
        };

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'X' && vis[i][j] != 1) {
                    count++;
                    vis[i][j] = 1;

                    for (int[] dir : directions) {
                        int rx = i + dir[0];
                        int ry = j + dir[1];

                        while (rx >= 0 && ry >= 0
                                && rx < board.length
                                && ry < board[0].length
                                && board[rx][ry] == 'X') {

                            vis[rx][ry] = 1;

                            rx += dir[0];
                            ry += dir[1];
                        }
                    }
                }
            }
        }

        return count;
    }
}
