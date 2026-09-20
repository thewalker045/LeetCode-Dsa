class Solution {
    public int numEnclaves(int[][] grid) {
        int count = 0;
        Queue<int[]> q = new LinkedList<>();
        int visited[][] = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 || j == 0 || i == grid.length - 1 || j == grid[i].length - 1) {
                    if (grid[i][j] == 1) {
                        q.offer(new int[] { i, j });
                        visited[i][j] = 1;
                    }
                }
            }
        }

        int directions[][] = {
                { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 }
        };

        while (!q.isEmpty()) {

            int x = q.peek()[0];
            int y = q.peek()[1];

            q.poll();

            for (int dir[] : directions) {
                int rx = x + dir[0];
                int ry = y + dir[1];

                if (rx >= 0 && ry >= 0 && rx < grid.length && ry < grid[0].length && visited[rx][ry] == 0
                        && grid[rx][ry] == 1) {
                    q.offer(new int[] { rx, ry });
                    visited[rx][ry] = 1;
                }
            }

        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (visited[i][j] == 0 && grid[i][j] == 1)
                    count++;
            }
        }

        return count;
    }
}