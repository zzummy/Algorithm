import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static long C;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    long A = Long.parseLong(st.nextToken());
    long B = Long.parseLong(st.nextToken());
    C = Long.parseLong(st.nextToken());

    // A : 밑, B : 지수
    System.out.println(pow(A, B));
  }

  public static long pow(long A, long B) {
    if (B == 1)
      return A % C;

    // A의 절반
    long temp = pow(A, B / 2);

    // 지수(B)가 홀수라면, A^(B/2) * A^(B/2) * A 를 해줘야함
    if (B % 2 == 1) {
      // 일반적으로 % C 연산을 하게 될 경우, long 범위를 초과함
      // temp * temp * A % C -> (temp * temp * A)는 long 범위를 초과하면서 잘못된 값이 나옴
      // 따라서 모듈러 연산을 통해 이를 막아준다

      return (((temp * temp % C) % C) * A) % C;
    }

    return temp * temp % C;
  }
}