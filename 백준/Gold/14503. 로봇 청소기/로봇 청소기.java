import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int N, M, r, c, d, answer = 1;
  static int[][] maps;
  // 북 동 남 서로 이동
  static int[] dx = { -1, 0, 1, 0 };
  static int[] dy = { 0, 1, 0, -1 };

  public static boolean range(int x, int y) {
    if (x >= 0 && x < N && y >= 0 && y < M)
      return true;
    else
      return false;
  }

  public static void DFS(int r, int c, int d) {
    // 청소하면 2
    maps[r][c] = 2;

    // 청소되지 않은 빈칸 있는 경우, 반시계 방향(북 서 남 동)으로 회전
    for (int i = 0; i < 4; i++) {
      d = (d + 3) % 4;
      int nx = r + dx[d];
      int ny = c + dy[d];

      if (maps[nx][ny] == 0 && range(nx, ny)) {
        answer++;
        DFS(nx, ny, d);

        return;
      }
    }

    // 주변 청소가 다 되어있을 경우
    // 후진할 곳이 벽이 아니라면 방향 유지한 채로 한칸 후진
    int back = (d + 2) % 4;
    int bx = r + dx[back];
    int by = c + dy[back];

    if (range(bx, by) && maps[bx][by] != 1) {
      DFS(bx, by, d);
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    maps = new int[N][M];
    st = new StringTokenizer(br.readLine());
    r = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());
    d = Integer.parseInt(st.nextToken());

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        maps[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    DFS(r, c, d);

    System.out.println(answer);
  }
}