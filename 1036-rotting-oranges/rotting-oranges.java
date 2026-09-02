class Solution {

    class Orange {
        int row;
        int col;
        int time;

        Orange(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<Orange> q = new LinkedList<>();
        int fresh = 0;
        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new Orange(i, j, 0));
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int[][] dir = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        while (!q.isEmpty()) {
            Orange cur = q.poll();
            ans = cur.time;

            for (int[] d : dir) {
                int nr = cur.row + d[0];
                int nc = cur.col + d[1];

                if (nr >= 0 && nr < m &&
                    nc >= 0 && nc < n &&
                    grid[nr][nc] == 1) {

                    grid[nr][nc] = 2;
                    fresh--;

                    q.offer(new Orange(nr, nc, cur.time + 1));
                }
            }
        }

        return fresh == 0 ? ans : -1;
    }
}