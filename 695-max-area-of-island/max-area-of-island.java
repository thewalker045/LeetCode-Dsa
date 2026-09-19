class Solution {

    public int bfs(int x, int y, int[][] grid, int[][] visited) {

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] { x, y });
        visited[x][y] = 1;

        int area = 0;

        int[][] directions = {
                { -1, 0 },
                { 0, -1 },
                { 0, 1 },
                { 1, 0 }
        };

        while (!q.isEmpty()) {

            int[] cell = q.poll();
            x = cell[0];
            y = cell[1];

            area++;

            for (int[] dir : directions) {

                int rx = x + dir[0];
                int ry = y + dir[1];

                if (rx >= 0 && ry >= 0 &&
                        rx < grid.length &&
                        ry < grid[0].length &&
                        grid[rx][ry] == 1 &&
                        visited[rx][ry] == 0) {

                    q.offer(new int[] { rx, ry });
                    visited[rx][ry] = 1;
                }
            }
        }

        return area;
    }

    public int maxAreaOfIsland(int[][] grid) {

        int[][] visited = new int[grid.length][grid[0].length];

        int maxArea = 0;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 1 && visited[i][j] == 0) {

                    int area = bfs(i, j, grid, visited);

                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }
}