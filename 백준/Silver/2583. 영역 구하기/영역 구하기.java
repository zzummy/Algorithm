import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
  static int M, N, K;
  static int[][] map;
  static int count;
  static int[] dx = { 0, 0, -1, 1 };
  static int[] dy = { 1, -1, 0, 0 };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    M = Integer.parseInt(st.nextToken());
    N = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(st.nextToken());
    map = new int[M][N];

    for (int k = 0; k < K; k++) {
      st = new StringTokenizer(br.readLine());
      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());

      for (int x = y1; x < y2; x++) {
        for (int y = x1; y < x2; y++) {
          map[x][y] = 1;
        }
      }
    }

    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        if (map[i][j] == 0) {
          count = 0;
          DFS(i, j);
          list.add(count);
        }
      }
    }

    Collections.sort(list);

    System.out.println(list.size());
    for (Integer num : list)
      System.out.print(num + " ");
  }

  public static void DFS(int x, int y) {
    map[x][y] = 1;
    count++;

    for (int d = 0; d < 4; d++) {
      int nx = x + dx[d];
      int ny = y + dy[d];

      if (check(nx, ny) && map[nx][ny] == 0) {
        DFS(nx, ny);
      }
    }
  }

  public static boolean check(int x, int y) {
    return x >= 0 && x < M && y >= 0 && y < N;
  }
}