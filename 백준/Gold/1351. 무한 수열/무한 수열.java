import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/*
 * 1351. 무한 수열
 * 
 * 수학 기호
 * ⌊ ⌋ : 내림
 * ⌈ ⌉ : 올림
 */

public class Main {
  static long N;
  static int P, Q;
  static HashMap<Long, Long> map = new HashMap<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Long.parseLong(st.nextToken());
    P = Integer.parseInt(st.nextToken());
    Q = Integer.parseInt(st.nextToken());

    System.out.println(solution(N));

  }

  public static long solution(long n) {
    if (n == 0)
      return 1;

    if (map.containsKey(n))
      return map.get(n);

    long a = (long) Math.floor(n / P);
    long b = (long) Math.floor(n / Q);

    map.put(n, solution(a) + solution(b));
    return map.get(n);
  }
}