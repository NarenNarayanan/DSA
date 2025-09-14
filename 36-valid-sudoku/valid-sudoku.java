class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch=board[i][j];
                if(ch == '.')continue;
                if(!seen.add(ch + " is seen in row " + i) || 
                    !seen.add(ch + " is seen in column " + j) || 
                    !seen.add(ch + " is seen in grid " + i/3 + "-" + j/3)
                )return false;
            }
        }
        return true;
    }
}