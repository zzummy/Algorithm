import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/5014

public class Main {
  static int F, S, G, U, D;
  static int[] visited;
  static int depth = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    F = Integer.parseInt(st.nextToken());
    S = Integer.parseInt(st.nextToken());
    G = Integer.parseInt(st.nextToken());
    U = Integer.parseInt(st.nextToken());
    D = Integer.parseInt(st.nextToken());

    visited = new int[F + 1]; // 1층부터 시작

    // S -> G로 가는 최단 경로 : BFS
    // 최단 경로이므로 visited 배열을 통해 방문한 곳 다시 방문하지 않도록
    System.out.println(BFS());
  }

  public static String BFS() {
    Queue<Integer> q = new LinkedList<>();
    q.add(S);

    visited[S] = 1;

    while (!q.isEmpty()) {
      int pos = q.poll();
      depth++;

      if (pos == G) {
        return String.valueOf(visited[pos] - 1);
      }

      // Up
      int up = pos + U;
      if (up <= F && visited[up] == 0) {
        visited[up] = visited[pos] + 1;
        q.add(up);
      }

      // Down
      int down = pos - D;
      if (down > 0 && visited[down] == 0) {
        visited[down] = visited[pos] + 1;
        q.add(down);
      }

    }

    return "use the stairs";
  }
}