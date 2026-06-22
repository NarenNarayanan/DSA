class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initial=image[sr][sc];
        if(initial==color)return image;

        dfs(image,sr,sc,color,initial);
        return image;
    }
    public void dfs(int[][] image,int row,int col,int color,int initial){
        if(row<0 || row>=image.length || col<0 || col>=image[0].length)return;
        if(image[row][col]!=initial)return;
        image[row][col]=color;
        dfs(image,row+1,col,color,initial);
        dfs(image,row-1,col,color,initial);
        dfs(image,row,col+1,color,initial);
        dfs(image,row,col-1,color,initial);
    }
}
