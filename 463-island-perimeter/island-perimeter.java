class Solution { 

    public int bfs(int x, int y, int[][] grid) { 

        int visited[][] = new int[grid.length][grid[0].length]; 
        Queue<int[]> q = new LinkedList<>(); 
        int perimeter = 0; 

        q.offer(new int[]{x, y}); 
        visited[x][y] = 1;

        int[][] directions = { 
            {-1,0},
            {0,-1},
            {0,1},
            {1,0}
        }; 

        while(!q.isEmpty()) { 

            int[] cell = q.poll();
            x = cell[0];
            y = cell[1];

            int current = 4; 

            for(int[] dir : directions) { 

                int rx = x + dir[0]; 
                int ry = y + dir[1]; 

                if(rx >= 0 && ry >= 0 && 
                   rx < grid.length && 
                   ry < grid[0].length) {

                    if(grid[rx][ry] == 1) {

                        current--;

                        if(visited[rx][ry] == 0) {
                            q.offer(new int[]{rx, ry});
                            visited[rx][ry] = 1;
                        }
                    }
                }
            }

            perimeter += current;
        }

        return perimeter; 
    } 

    public int islandPerimeter(int[][] grid) { 

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {

                if(grid[i][j] == 1)
                    return bfs(i, j, grid);
            }
        }

        return -1; 
    } 
}