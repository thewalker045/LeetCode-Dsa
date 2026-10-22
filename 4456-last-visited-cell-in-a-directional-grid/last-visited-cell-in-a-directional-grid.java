
class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] vis = new int[m][n];
        int r = 0, c = 0;

        while (true) {
            vis[r][c] = 1;

            int nr = r, nc = c;

            if (grid[r][c] == 'L') nc--;
            else if (grid[r][c] == 'R') nc++;
            else if (grid[r][c] == 'U') nr--;
            else if (grid[r][c] == 'D') nr++;

            if (nr < 0 || nr >= m || nc < 0 || nc >= n
                    || vis[nr][nc] == 1) {
                return new int[]{r, c};
            }

            r = nr;
            c = nc;
        }
    }
}
