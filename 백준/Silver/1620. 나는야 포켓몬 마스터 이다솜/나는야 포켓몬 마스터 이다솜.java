import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/*
 * 1620. 나는야 포켓몬 마스터 이다솜
 */

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    HashMap<String, Integer> map = new HashMap<>();
    String[] arr = new String[N + 1];

    // 1~N번의 포켓몬 입력
    for (int n = 1; n <= N; n++) {
      String name = br.readLine();
      map.put(name, n);
      arr[n] = name;
    }

    StringBuilder sb = new StringBuilder();
    // 맞춰야하는 문제 M개
    for (int m = 0; m < M; m++) {
      String input = br.readLine();
      // 숫자 입력 -> 포켓몬 번호에 해당하는 이름 출력
      if (isNumber(input)) {
        sb.append(arr[Integer.parseInt(input)]).append("\n");
      }
      // 알파벳 입력 -> 포켓몬 번호 출력
      else {
        sb.append(map.get(input)).append("\n");
      }
    }

    System.out.println(sb.toString());
  }

  public static boolean isNumber(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (Character.isDigit(str.charAt(i)))
        return true;
    }
    return false;
  }
}