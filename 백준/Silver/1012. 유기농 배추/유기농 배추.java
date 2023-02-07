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
  static int[] dx = { 0, 1, 0, -1 };
  static int[] dy = { 1, 0, -1, 0 };
  static int[][] map;
  static int M, N;
  static int[] answer;
  static Queue<Point> q;

  public static boolean check(int x, int y) {
    if (x >= 0 && x < M && y >= 0 && y < N)
      return true;
    else
      return false;
  }

  public static void BFS(int x, int y) {
    q.offer(new Point(x, y));

    while (!q.isEmpty()) {
      Point tmp = q.poll();
      for (int i = 0; i < 4; i++) {
        int nx = tmp.x + dx[i];
        int ny = tmp.y + dy[i];
        if (check(nx, ny) && map[nx][ny] == 1) {
          map[nx][ny] = 0;
          q.offer(new Point(nx, ny));
        }
      }
    }
  }

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    answer = new int[T];

    for (int t = 0; t < T; t++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      // 가로 M, 세로 N, 배추 개수 K
      M = Integer.parseInt(st.nextToken());
      N = Integer.parseInt(st.nextToken());
      int K = Integer.parseInt(st.nextToken());
      map = new int[M][N];
      q = new LinkedList<>();

      for (int k = 0; k < K; k++) {
        st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        map[X][Y] = 1;
      }

      for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
          if (map[i][j] == 1) {
            answer[t]++;
            map[i][j] = 0;
            BFS(i, j);
          }
        }
      }
    }

    for (int t = 0; t < T; t++)
      System.out.println(answer[t]);
  }
}