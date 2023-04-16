import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static boolean[] prime;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int M = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());

    prime = new boolean[N + 1];
    getPrime();
    for (int i = M; i <= N; i++) {
      if (!prime[i])
        System.out.println(i);
      ;

    }
  }

  public static void getPrime() {
    // true = 소수X, false = 소수
    // 0과 1은 소수가 아님
    prime[0] = prime[1] = true;

    for (int i = 2; i <= Math.sqrt(prime.length); i++) {
      if (prime[i])
        continue;

      for (int j = i * i; j < prime.length; j += i) {
        prime[j] = true;
      }
    }
  }
}