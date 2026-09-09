import java.util.*;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originalColor = image[sr][sc];

        if (originalColor == color) {
            return image;
        }

        int m = image.length;
        int n = image[0].length;

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{sr, sc});

       
        image[sr][sc] = color;

        int[][] directions = {
            {-1, 0}, 
            {1, 0},  
            {0, -1}, 
            {0, 1}    
        };

        while (!queue.isEmpty()) {

            int[] current = queue.poll();

            int row = current[0];
            int col = current[1];

            for (int[] dir : directions) {

                int newRow = row + dir[0];
                int newCol = col + dir[1];

               
                if (newRow >= 0 && newRow < m &&
                    newCol >= 0 && newCol < n) {

                   
                    if (image[newRow][newCol] == originalColor) {

                       
                        image[newRow][newCol] = color;

                        queue.offer(new int[]{newRow, newCol});
                    }
                }
            }
        }

        return image;
    }
}