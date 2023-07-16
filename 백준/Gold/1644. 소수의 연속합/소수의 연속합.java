import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * https://www.acmicpc.net/problem/1644
 */

public class Main {
  static boolean[] prime;
  static ArrayList<Integer> list = new ArrayList<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    // 소수 배열 구하기
    prime = new boolean[N + 1];
    isPrime(N);

    for (int i = 2; i <= N; i++) {
      if (!prime[i])
        list.add(i);
    }

    int s = 0, e = 0;
    int answer = 0, sum = 2; // 첫번째 소수는 2이기 때문에 ,,

    while (s <= e && e < list.size()) {
      if (sum >= N) {
        if (sum == N)
          answer++;
        sum -= list.get(s);
        s++;
      } else {
        e++;
        if (e >= list.size())
          break;
        sum += list.get(e);
      }
    }

    System.out.println(answer);
  }

  public static void isPrime(int N) {
    prime[0] = prime[1] = true;

    for (int i = 2; i <= Math.sqrt(N); i++) {
      if (!prime[i]) {
        for (int j = i * i; j <= N; j += i)
          prime[j] = true;
      }
    }
  }
}