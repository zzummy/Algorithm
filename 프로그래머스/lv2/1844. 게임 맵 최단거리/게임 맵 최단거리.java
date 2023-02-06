import java.util.*;

class Point {
  public int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class Solution {
    static int n, m;
    static int[] dx = { 0, 1, 0, -1 };
    static int[] dy = { 1, 0, -1, 0 };
    static int[][] dis;
    static Queue<Point> q = new LinkedList<>();

    public static void BFS(int x, int y, int[][] maps) {
        q.offer(new Point(x, y));
        maps[x][y] = 0;

        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1) {
                    maps[nx][ny] = 0;
                    q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }
    
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        dis = new int[maps.length][maps[0].length];
        dis[0][0] = 1;
        BFS(0, 0, maps);
        
        if (dis[n-1][m-1] == 0) 
            return -1;
        else    
            return dis[n-1][m-1];
    }

}