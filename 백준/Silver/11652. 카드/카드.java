import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    Map<Long, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      long num = Long.parseLong(br.readLine());

      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    int max = 0;
    long answer = 0;

    for (Map.Entry<Long, Integer> entry : map.entrySet()) {
      if (max < entry.getValue()) {
        max = entry.getValue();
        answer = entry.getKey();
      }

      // 가장 많이 가지고 있는 정수 값이 같을 경우, 작은 것을 출력
      if (max == entry.getValue()) {
        answer = Math.min(answer, entry.getKey());
      }
    }

    System.out.println(answer);
  }
}