import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int N, M, answer = 0;
  static int[][] graph;
  static boolean[] chk;

  public static void DFS(int s) {
    chk[s] = true;
    for (int i = 1; i <= N; i++) {
      if (graph[s][i] == 1 && !chk[i])
        DFS(i);
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    graph = new int[N + 1][N + 1];
    chk = new boolean[N + 1];
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int u = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());
      graph[u][v] = graph[v][u] = 1;
    }

    for (int i = 1; i <= N; i++) {
      if (!chk[i]) {
        DFS(i);
        answer++;
      }
    }
    System.out.println(answer);
  }
}