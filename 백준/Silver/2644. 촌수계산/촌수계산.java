import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  static int N, A, B, M;
  static int[][] maps;
  static int[] dis;

  public static void BFS(int start) {
    Queue<Integer> q = new LinkedList<>();
    q.offer(start);

    while (!q.isEmpty()) {
      int tmp = q.poll();

      if (tmp == B)
        break;

      for (int i = 1; i <= N; i++) {
        if (maps[tmp][i] == 1 && dis[i] == 0) {
          dis[i] = dis[tmp] + 1;
          q.offer(i);
        }
      }
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    maps = new int[N + 1][N + 1];
    dis = new int[N + 1];

    StringTokenizer st = new StringTokenizer(br.readLine());
    A = Integer.parseInt(st.nextToken());
    B = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(br.readLine());
    for (int m = 0; m < M; m++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      maps[x][y] = maps[y][x] = 1;
    }

    BFS(A);

    if (dis[B] == 0)
      System.out.println(-1);
    else
      System.out.println(dis[B]);
  }
}