class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // Get the initial color of the starting pixel
        int initialColor = image[sr][sc];
        
        // Edge Case: If the starting pixel already has the target color,
        // returning immediately prevents infinite recursion loops.
        if (initialColor == color) {
            return image;
        }
        
        // Start the recursive traversal
        dfs(image, sr, sc, initialColor, color);
        
        return image;
    }
    
    private void dfs(int[][] image, int row, int col, int initialColor, int newColor) {
        // Base Case: Verify grid boundaries
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length) {
            return;
        }
        
        // Base Case: Stop if the pixel does not match the starting pixel's original color
        if (image[row][col] != initialColor) {
            return;
        }
        
        // Update the pixel with the new color
        image[row][col] = newColor;
        
        // Recursively visit all 4 adjacent neighbors (Up, Down, Left, Right)
        dfs(image, row + 1, col, initialColor, newColor); // Down
        dfs(image, row - 1, col, initialColor, newColor); // Up
        dfs(image, row, col + 1, initialColor, newColor); // Right
        dfs(image, row, col - 1, initialColor, newColor); // Left
    }
}
