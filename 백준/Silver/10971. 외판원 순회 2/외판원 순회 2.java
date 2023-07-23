import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int N;
  static int[][] map;
  static boolean[] visited;
  static long answer = Integer.MAX_VALUE;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    map = new int[N][N];

    StringTokenizer st;
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        map[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    // N개의 도시를 모두 DFS로 돌림
    for (int i = 0; i < N; i++) {
      visited = new boolean[N];
      visited[i] = true; // 시작 지점 = 방문 O
      dfs(i, i, 0);
    }

    System.out.println(answer);
  }

  public static void dfs(int start, int now, int cost) {
    // 1 ~ N까지의 도시를 모두 방문했는지 확인
    if (allVisited()) {
      if (map[now][start] != 0)
        answer = Math.min(answer, cost + map[now][0]);
      return;
    }

    for (int i = 1; i < N; i++) {
      // map[i][j] == 0 갈 수 있는 루트가 없는 경우
      // visited[i] 방문하지 않은 경우
      if (!visited[i] && map[now][i] != 0) {
        visited[i] = true;
        dfs(start, i, cost + map[now][i]);
        visited[i] = false;
      }
    }
  }

  public static boolean allVisited() {
    for (int i = 0; i < N; i++) {
      // 하나라도 false면 모두 방문 X
      if (!visited[i])
        return false;
    }
    return true;
  }
}