import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  static long[] dp;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    dp = new long[N + 1];

    for (int i = 0; i < N + 1; i++) {
      dp[i] = -1;
    }

    dp[0] = 0;
    dp[1] = 1;

    System.out.println(fivo(N));
  }

  public static long fivo(int n) {
    if (dp[n] == -1) {
      dp[n] = fivo(n - 1) + fivo(n - 2);
    }

    return dp[n];
  }
}