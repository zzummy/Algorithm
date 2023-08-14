import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
  int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

public class Main {
  static int N, M;
  static int[][] map;
  static int[][] dis;
  static int[] dx = { 0, 0, -1, 1 };
  static int[] dy = { 1, -1, 0, 0 };
  static Queue<Point> q = new LinkedList<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    map = new int[N + 1][M + 1];
    dis = new int[N + 1][M + 1];

    for (int i = 1; i <= N; i++) {
      String input = br.readLine();
      for (int j = 1; j <= M; j++) {
        map[i][j] = input.charAt(j - 1) - '0';
      }
    }

    dis[1][1] = 1;
    BFS(1, 1);

    System.out.println(dis[N][M]);
  }

  public static void BFS(int x, int y) {
    q.add(new Point(x, y));
    map[x][y] = 0;

    while (!q.isEmpty()) {
      Point tmp = q.poll();

      for (int d = 0; d < 4; d++) {
        int nx = tmp.x + dx[d];
        int ny = tmp.y + dy[d];

        if (check(nx, ny) && map[nx][ny] == 1) {
          q.add(new Point(nx, ny));
          dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
          map[nx][ny] = 0;
        }
      }
    }
  }

  public static boolean check(int x, int y) {
    return x >= 1 && x <= N && y >= 1 && y <= M;
  }
}