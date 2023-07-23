import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2468

public class Main {
  static int N, answer = 0;
  static int[][] map;
  static boolean[][] visited;
  static int[] dx = { 0, 0, -1, 1 };
  static int[] dy = { 1, -1, 0, 0 };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    map = new int[N][N];

    StringTokenizer st;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        map[i][j] = Integer.parseInt(st.nextToken());
        max = Math.max(max, map[i][j]);
      }
    }

    // 모든 지역 탐색하면서, 안전 영역일 경우 DFS 탐색
    for (int h = 0; h <= max; h++) {
      visited = new boolean[N][N];

      int cnt = 0;
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          if (map[i][j] > h && !visited[i][j]) {
            DFS(i, j, h);
            cnt++;
          }
        }
      }
      answer = Math.max(answer, cnt);
    }

    System.out.println(answer);
  }

  // (x,y)를 시작으로 안전영역인 구간을 탐색하면서 visited[x][y] = true
  // 탐색 구간이 더이상 없으면 return 1
  public static void DFS(int x, int y, int h) {
    visited[x][y] = true;

    // 상하좌우 탐색
    for (int d = 0; d < 4; d++) {
      int nx = x + dx[d];
      int ny = y + dy[d];

      if (check(nx, ny)) {
        if (map[nx][ny] > h && !visited[nx][ny])
          DFS(nx, ny, h);
      }
    }

  }

  public static boolean check(int x, int y) {
    return (x >= 0 && x < N && y >= 0 && y < N);
  }
}