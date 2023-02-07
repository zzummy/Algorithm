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
  static int[] dx = { 0, 1, 1, 1, 0, -1, -1, -1 };
  static int[] dy = { 1, 1, 0, -1, -1, -1, 0, 1 };
  static int W, H;
  static int[][] maps;
  static int[] answer;
  static Queue<Point> q = new LinkedList<>();

  public static void BFS(int x, int y) {
    q.offer(new Point(x, y));
    maps[x][y] = 0;

    while (!q.isEmpty()) {
      Point tmp = q.poll();
      for (int i = 0; i < 8; i++) {
        int nx = tmp.x + dx[i];
        int ny = tmp.y + dy[i];
        if (nx >= 0 && nx < H && ny >= 0 && ny < W && maps[nx][ny] == 1) {
          maps[nx][ny] = 0;
          q.offer(new Point(nx, ny));
        }
      }
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    StringBuilder sb = new StringBuilder();

    while (true) {
      st = new StringTokenizer(br.readLine());
      W = Integer.parseInt(st.nextToken());
      H = Integer.parseInt(st.nextToken());
      // 0 0이면 종료
      if (W == 0 && H == 0)
        break;

      maps = new int[H][W];
      for (int i = 0; i < H; i++) {
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < W; j++) {
          maps[i][j] = Integer.parseInt(st.nextToken());
        }
      }

      int cnt = 0;
      for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
          if (maps[i][j] == 1) {
            cnt++;
            BFS(i, j);
          }
        }
      }

      sb.append(cnt + " ");
    }
    String[] answer = sb.toString().split(" ");
    for (String s : answer)
      System.out.println(s);
  }
}