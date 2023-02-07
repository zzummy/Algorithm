import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int N, M, answer = 0;
  static int[][] graph;
  static boolean[] chk;

  public static void DFS(int L) {
    if (chk[L]) {
      return;
    } else {
      chk[L] = true;
      for (int i = 1; i <= N; i++) {
        if (graph[L][i] == 1 && !chk[i]) {
          answer++;
          DFS(i);
        }
      }
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    M = Integer.parseInt(br.readLine());
    graph = new int[N + 1][N + 1];
    chk = new boolean[N + 1];

    StringTokenizer st;
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      graph[a][b] = graph[b][a] = 1;
    }

    DFS(1);
    System.out.println(answer);
  }
}