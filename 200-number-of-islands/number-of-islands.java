class Solution {

    int[][] visited;

    public void bfs(int x, int y, char[][] grid) {

        if (visited[x][y] == 1)
            return;

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        visited[x][y] = 1;

        int[][] directions = {
            {-1, 0},
            {0, -1},
            {1, 0},
            {0, 1}
        };

        while (!q.isEmpty()) {

            x = q.peek()[0];
            y = q.peek()[1];

            q.poll();

            for (int[] dir : directions) {

                int rx = x + dir[0];
                int ry = y + dir[1];

                if (rx >= 0 && ry >= 0 &&
                    rx < grid.length &&
                    ry < grid[0].length &&
                    visited[rx][ry] == 0 &&
                    grid[rx][ry] == '1') {

                    q.offer(new int[]{rx, ry});
                    visited[rx][ry] = 1;
                }
            }
        }
    }

    public int numIslands(char[][] grid) {

        visited = new int[grid.length][grid[0].length];

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] == '1' && visited[i][j] == 0) {

                    count++;
                    bfs(i, j, grid);
                }
            }
        }

        return count;
    }
}