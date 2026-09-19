import java.util.*;

class Solution {

    public int[][] updateMatrix(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int[][] ans = new int[n][m];

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (mat[i][j] == 0) {
                    q.offer(new int[]{i, j});
                    ans[i][j] = 0;
                } else {
                    ans[i][j] = -1;
                }
            }
        }

        int[][] dir = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        while (!q.isEmpty()) {

            int[] curr = q.poll();

            int x = curr[0];
            int y = curr[1];

            for (int[] d : dir) {

                int nx = x + d[0];
                int ny = y + d[1];

                if (nx >= 0 && nx < n &&
                    ny >= 0 && ny < m &&
                    ans[nx][ny] == -1) {

                    ans[nx][ny] = ans[x][y] + 1;

                    q.offer(new int[]{nx, ny});
                }
            }
        }

        return ans;
    }
}