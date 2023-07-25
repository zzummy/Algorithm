import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int N;
  static int[][] arr;
  static boolean[] visited;
  static int answer = Integer.MAX_VALUE;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    arr = new int[N][N];
    visited = new boolean[N];

    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    combi(0, 0);

    System.out.println(answer);
  }

  public static void combi(int cnt, int start) {
    if (cnt == N / 2) {
      calc();
      return;
    }

    for (int i = start; i < N; i++) {
      if (!visited[i]) {
        visited[i] = true;
        combi(cnt + 1, i + 1);
        visited[i] = false;
      }
    }
  }

  public static void calc() {
    int start_team = 0;
    int link_team = 0;

    for (int i = 0; i < N - 1; i++) {
      for (int j = i + 1; j < N; j++) {
        // visited[i] 와 visited[j] 가 true이면, start_team 점수에 추가
        if (visited[i] && visited[j]) {
          start_team += arr[i][j];
          start_team += arr[j][i];
        } else if (!visited[i] && !visited[j]) {
          link_team += arr[i][j];
          link_team += arr[j][i];
        }
      }
    }

    answer = Math.min(answer, Math.abs(start_team - link_team));
  }
}