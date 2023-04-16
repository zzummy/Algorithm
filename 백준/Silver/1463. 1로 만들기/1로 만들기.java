import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1463. 1로 만들기
 * 
 * DP 풀 땐, 3단계로 생각하기
 * 1. 테이블 정의
 * 2. 점화식 찾기
 * 3. 초기값 정하기
 */

public class Main {
  static int[] dp;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    dp = new int[N + 1];

    System.out.println(solution(N));
  }

  public static int solution(int n) {
    dp[0] = dp[1] = 0;

    for (int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + 1;
      if (i % 2 == 0)
        dp[i] = Math.min(dp[i], dp[i / 2] + 1);
      if (i % 3 == 0)
        dp[i] = Math.min(dp[i], dp[i / 3] + 1);
    }

    return dp[n];
  }
}