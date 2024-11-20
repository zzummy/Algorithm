import java.util.*;

class Point{
    public int x, y;
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Solution {
    Queue<Point> q = new LinkedList<>();
    int[][] dis;
    
    int N, M;
    int[] dx = {0, 0, -1, 1};
    int[] dy = {1, -1, 0, 0};
    
    public void BFS(int x, int y, int[][] maps){
        q.offer(new Point(x,y));
        maps[x][y] = 0;
        
        while(!q.isEmpty()){
            Point tmp = q.poll();
            
            for(int d=0; d<4; d++){
                int nx = tmp.x + dx[d];
                int ny = tmp.y + dy[d];
                
                if(nx >= 0 && ny >= 0 && nx < N && ny < M && maps[nx][ny] == 1){
                    maps[nx][ny] = 0;
                    q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }
    
    public int solution(int[][] maps) {
        N = maps.length;
        M = maps[0].length;
        dis = new int[N][M];
        
        dis[0][0] = 1;
        BFS(0,0, maps);
        
        
        if(dis[N-1][M-1] == 0)
            return -1;
        else
            return dis[N-1][M-1];
    }
}