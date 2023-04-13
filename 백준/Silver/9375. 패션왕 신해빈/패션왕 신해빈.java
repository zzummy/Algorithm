import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
 * 9375. 패션왕 신해빈
 */

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int T = Integer.parseInt(br.readLine());
    for (int t = 0; t < T; t++) {
      int n = Integer.parseInt(br.readLine());

      HashMap<String, Integer> map = new HashMap<>();
      for (int i = 0; i < n; i++) {
        String[] input = br.readLine().split(" ");
        // 옷 종류만 쓰면 됨
        String kind = input[1];

        if (map.containsKey(kind)) {
          map.put(kind, map.getOrDefault(kind, 0) + 1);
        } else {
          map.put(kind, 1);
        }
      }

      int answer = 1;
      for (int k : map.values()) {
        answer *= (k + 1);
      }

      // 알몸인 경우를 뺴줘야함
      sb.append(answer - 1).append('\n');
    }

    System.out.println(sb);
  }
}