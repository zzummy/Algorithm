import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int s = 0, e = 0;
    int sum = 0, answer = 0;

    // s == N 되기 전까지 반복
    // 1) s++ 하면서 부분합 구하기
    // 2) e++ 하면서 부분합 구하기
    while (s <= N) {
      while (++e <= N) {
        sum += e;
        if (sum >= N) {
          if (sum == N)
            answer++;
          break;
        }
      }

      while (++s <= N) {
        sum -= s;
        // 위와 반대로 값이 작으면 s는 올려줘야함
        if (sum <= N) {
          if (sum == N)
            answer++;
          break;
        }
      }
    }

    System.out.println(answer);
  }
}