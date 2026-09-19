class Solution {

    int[][] dir = {
        {-1, 0},
        {0, -1},
        {1, 0},
        {0, 1}
    };

    public void bfs(char[][] board, int x, int y, int[][] visited) {

        int n = board.length;
        int m = board[0].length;

        Queue<int[]> q = new LinkedList<>();
        List<int[]> coordinates = new ArrayList<>();

        q.offer(new int[]{x, y});
        visited[x][y] = 1;
        coordinates.add(new int[]{x, y});

        boolean boundary = false;

        while (!q.isEmpty()) {

            int[] curr = q.poll();

            int i = curr[0];
            int j = curr[1];

            if (i == 0 || i == n - 1 ||
                j == 0 || j == m - 1) {
                boundary = true;
            }

            for (int[] d : dir) {

                int ni = i + d[0];
                int nj = j + d[1];

                if (ni >= 0 && ni < n &&
                    nj >= 0 && nj < m &&
                    visited[ni][nj] == 0 &&
                    board[ni][nj] == 'O') {

                    visited[ni][nj] = 1;
                    q.offer(new int[]{ni, nj});
                    coordinates.add(new int[]{ni, nj});
                }
            }
        }

        if (!boundary) {
            for (int[] p : coordinates) {
                board[p[0]][p[1]] = 'X';
            }
        }
    }

    public void solve(char[][] board) {

        int n = board.length;
        int m = board[0].length;

        int[][] visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (board[i][j] == 'O' && visited[i][j] == 0) {
                    bfs(board, i, j, visited);
                }
            }
        }
    }
}