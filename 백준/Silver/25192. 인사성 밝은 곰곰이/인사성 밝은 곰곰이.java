import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/*
 * 26069. 붙임성 좋은 총총이
 */

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    HashSet<String> set = new HashSet<>();

    int answer = 0;
    for (int i = 0; i < N; i++) {
      String input = br.readLine();

      // ENTER가 입력되면 초기화
      if (input.equals("ENTER")) {
        set.clear();
        continue;
      }

      if (!set.contains(input)) {
        set.add(input);
        answer++;
      }
    }

    System.out.println(answer);
  }
}