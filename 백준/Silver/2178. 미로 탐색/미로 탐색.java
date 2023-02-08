import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
  public int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

public class Main {
  static int N, M, cnt = 0;
  static int[][] map, dis;
  static int[] dx = { 0, 1, 0, -1 };
  static int[] dy = { 1, 0, -1, 0 };
  static Queue<Point> q = new LinkedList<>();

  public static void bfs(int x, int y) {
    q.offer(new Point(x, y));
    map[x][y] = 0;
    while (!q.isEmpty()) {
      Point tmp = q.poll();
      for (int i = 0; i < 4; i++) {
        int nx = tmp.x + dx[i];
        int ny = tmp.y + dy[i];
        if (nx >= 1 && nx <= N && ny >= 1 && ny <= M && map[nx][ny] == 1) {
          q.offer(new Point(nx, ny));
          dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
          map[nx][ny] = 0;
        }
      }

    }

  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    map = new int[N + 1][M + 1];
    dis = new int[N + 1][M + 1];

    for (int i = 1; i <= N; i++) {
      String str = br.readLine();
      for (int j = 1; j <= M; j++) {
        map[i][j] = str.charAt(j - 1) - '0';
      }
    }
    dis[1][1] = 1;
    bfs(1, 1);
    System.out.println(dis[N][M]);
  }
}