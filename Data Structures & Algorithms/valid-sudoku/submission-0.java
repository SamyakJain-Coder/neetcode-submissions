class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;
                if(map.containsKey(board[i][j]))return false;
                map.put(board[i][j],1);
            }
            map.clear();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.')continue;
                if(map.containsKey(board[j][i]))return false;
                map.put(board[j][i],1);
            }
        }
       for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                HashMap<Character,Integer> map=new HashMap<>();

                for(int r=i;r<i+3;r++){
                    for(int c=j;c<j+3;c++){
                        if(board[r][c]=='.')continue;
                        if(map.containsKey(board[r][c]))return false;
                        map.put(board[r][c],1);
                    }
                }
            }
        }
        return true;
    }
}
