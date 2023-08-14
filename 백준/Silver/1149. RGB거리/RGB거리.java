import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int[][] cost;
  static int[][] dp;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    cost = new int[N][3];
    dp = new int[N][3]; // 누적합 저장할 곳

    StringTokenizer st;
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      cost[i][0] = Integer.parseInt(st.nextToken()); // R
      cost[i][1] = Integer.parseInt(st.nextToken()); // G
      cost[i][2] = Integer.parseInt(st.nextToken()); // B
    }

    // dp의 첫번째 집들의 값은 cost의 첫번째 RGB로 초기화
    dp[0][0] = cost[0][0];
    dp[0][1] = cost[0][1];
    dp[0][2] = cost[0][2];

    System.out.println(Math.min(Paint(N - 1, 0), Math.min(Paint(N - 1, 1), Paint(N - 1, 2))));
  }

  public static int Paint(int N, int colorIdx) {
    // 탐색하지 않은 배열이라면
    if (dp[N][colorIdx] == 0) {

      if (colorIdx == 0) {
        dp[N][colorIdx] = Math.min(Paint(N - 1, 1), Paint(N - 1, 2)) + cost[N][0];
      } else if (colorIdx == 1) {
        dp[N][colorIdx] = Math.min(Paint(N - 1, 0), Paint(N - 1, 2)) + cost[N][1];
      } else {
        dp[N][colorIdx] = Math.min(Paint(N - 1, 0), Paint(N - 1, 1)) + cost[N][2];
      }
    }

    return dp[N][colorIdx];
  }
}