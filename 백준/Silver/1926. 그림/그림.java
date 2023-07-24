import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
  static int N, M;
  static int[][] map;
  static int[] dx = { 0, 0, -1, 1 };
  static int[] dy = { 1, -1, 0, 0 };
  static boolean[][] visited;
  static int count = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    map = new int[N][M];
    visited = new boolean[N][M];

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        map[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    ArrayList<Integer> answer = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        count = 0;
        if (map[i][j] == 1 && !visited[i][j]) {
          DFS(i, j);
          answer.add(count);
        }
      }
    }

    Collections.sort(answer);

    if (answer.size() > 0) {
      System.out.println(answer.size());
      System.out.println(answer.get(answer.size() - 1));
    } else {
      System.out.println(0);
      System.out.println(0);
    }
  }

  public static void DFS(int x, int y) {
    visited[x][y] = true;
    count++;

    for (int d = 0; d < 4; d++) {
      int nx = x + dx[d];
      int ny = y + dy[d];

      if (check(nx, ny) && map[nx][ny] == 1 && !visited[nx][ny]) {
        DFS(nx, ny);
      }
    }
  }

  public static boolean check(int x, int y) {
    return x >= 0 && y >= 0 && x < N && y < M;
  }

}