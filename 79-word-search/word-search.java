class Solution {
    public boolean dfs(char[][] board,int row,int col,int index,String word){
        if(index==word.length())return true;
        if(row>=board.length || row<0 || col>=board[0].length || col<0 || board[row][col]=='#')return false;
        if(board[row][col]!=word.charAt(index))return false;
        char temp=board[row][col];
        board[row][col]='#';
        boolean found=dfs(board,row+1,col,index+1,word) || dfs(board,row,col+1,index+1,word) || dfs(board,row-1,col,index+1,word) || dfs(board,row,col-1,index+1,word);
        board[row][col]=temp;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(board,i,j,0,word))return true;
                }
            }
        }
        return false;
    }
}