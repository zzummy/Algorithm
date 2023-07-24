import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int R, C, count = 0;
  static int[][] map;
  static boolean[] alpha;
  static int max = 0;
  static int[] dx = { 0, 0, -1, 1 };
  static int[] dy = { 1, -1, 0, 0 };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    R = Integer.parseInt(st.nextToken());
    C = Integer.parseInt(st.nextToken());
    map = new int[R][C];
    alpha = new boolean[26];

    for (int i = 0; i < R; i++) {
      String input = br.readLine();
      for (int j = 0; j < C; j++) {
        map[i][j] = input.charAt(j) - 'A';
      }
    }

    DFS(0, 0, 0);

    System.out.println(max);
  }

  public static void DFS(int x, int y, int cnt) {
    if (alpha[map[x][y]]) {
      max = Math.max(max, cnt);
      return;
    } else {
      alpha[map[x][y]] = true;

      for (int d = 0; d < 4; d++) {
        int nx = x + dx[d];
        int ny = y + dy[d];

        if (check(nx, ny)) {
          DFS(nx, ny, cnt + 1);
        }
      }

      alpha[map[x][y]] = false;
    }
  }

  public static boolean check(int x, int y) {
    return (x >= 0 && x < R & y >= 0 && y < C);
  }
}