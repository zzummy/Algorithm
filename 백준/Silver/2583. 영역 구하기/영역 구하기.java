import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
  static int M, N, K, cnt = 0;
  static int[][] maps;
  static int[] dx = { 0, 1, 0, -1 };
  static int[] dy = { 1, 0, -1, 0 };
  static ArrayList<Integer> list = new ArrayList<>();

  public static void DFS(int x, int y) {
    maps[x][y] = 1;
    cnt++;

    for (int d = 0; d < 4; d++) {
      int nx = x + dx[d];
      int ny = y + dy[d];
      if (nx >= 0 && nx < M && ny >= 0 && ny < N && maps[nx][ny] == 0) {
        DFS(nx, ny);
      }
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    M = Integer.parseInt(st.nextToken());
    N = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(st.nextToken());
    maps = new int[M][N];

    for (int k = 0; k < K; k++) {
      st = new StringTokenizer(br.readLine());
      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());

      for (int x = y1; x < y2; x++) {
        for (int y = x1; y < x2; y++) {
          maps[x][y] = 1;
        }
      }
    }

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        if (maps[i][j] == 0) {
          cnt = 0;
          DFS(i, j);
          list.add(cnt);
        }
      }
    }

    System.out.println(list.size());
    Collections.sort(list);
    for (int n : list)
      System.out.print(n + " ");

  }
}