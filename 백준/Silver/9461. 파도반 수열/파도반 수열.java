import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/9461

public class Main {
  static long[] dp = new long[101];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    for (int t = 0; t < T; t++) {
      int N = Integer.parseInt(br.readLine());

      for (int i = 0; i < N + 1; i++) {
        dp[i] = -1;
      }

      dp[0] = 0;
      dp[1] = 1;
      dp[2] = 1;
      dp[3] = 1;

      sb.append(padovan(N)).append('\n');
    }

    System.out.println(sb);
  }

  public static long padovan(int n) {
    if (dp[n] == -1) {
      dp[n] = padovan(n - 2) + padovan(n - 3);
    }

    return dp[n];
  }
}