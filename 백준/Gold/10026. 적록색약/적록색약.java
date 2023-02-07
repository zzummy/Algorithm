import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  static char[][] maps;
  static boolean[][] visited;
  static int[] answer;
  static int N, cnt;
  static int[] dx = { 0, 1, 0, -1 };
  static int[] dy = { 1, 0, -1, 0 };

  public static void DFS(int x, int y) {
    visited[x][y] = true;
    char tmp = maps[x][y];

    for (int i = 0; i < 4; i++) {
      int nx = x + dx[i];
      int ny = y + dy[i];
      if (nx >= 0 && nx < N && ny >= 0 && ny < N && maps[nx][ny] == tmp && !visited[nx][ny]) {
        visited[nx][ny] = true;
        DFS(nx, ny);
      }

    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    maps = new char[N][N];
    visited = new boolean[N][N];

    for (int i = 0; i < N; i++) {
      String str = br.readLine();
      for (int j = 0; j < N; j++) {
        maps[i][j] = str.charAt(j);
      }
    }

    // 적록X, 적록O의 수 담을 정답 배열
    answer = new int[2];

    cnt = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (!visited[i][j]) {
          cnt++;
          DFS(i, j);
        }
      }
    }
    answer[0] = cnt;

    cnt = 0;
    visited = new boolean[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (maps[i][j] == 'G')
          maps[i][j] = 'R';
      }
    }

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (!visited[i][j]) {
          cnt++;
          DFS(i, j);
        }
      }
    }
    answer[1] = cnt;

    for (int n : answer)
      System.out.print(n + " ");
    System.out.println();
  }
}