class Solution {
    // 상 하 좌 우 상좌 상우 하좌 하우
    static int[] dx = {0, 0, -1, 1, -1, 1, -1, 1};
    static int[] dy = {1, -1, 0, 0, 1, 1, -1, -1};
    static int len;
    
    public boolean Contain(int nx, int ny){
        if((nx >=0 && nx < len) && (ny >=0 && ny < len))
            return true;
        else return false;
    }
    
    public void Check(int x, int y, int[][] board){
        for(int i = 0; i < 8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(Contain(nx,ny)){
                if(board[nx][ny] != 1) 
                board[nx][ny] = 2; 
            }
        }
    }
    
    public int solution(int[][] board) {
        int answer = 0;
        len = board.length;
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 1) {
                    Check(i, j, board);
                }
            }
        }
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 0) answer++;
            }
        }
        return answer;
    }
}