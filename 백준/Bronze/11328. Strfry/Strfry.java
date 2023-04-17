import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    for (int n = 0; n < N; n++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String str1 = st.nextToken();
      String str2 = st.nextToken();

      // 알파벳 배열
      int[] arr = new int[26];
      boolean isPossible = true;

      for (int i = 0; i < str1.length(); i++) {
        arr[str1.charAt(i) - 97] += 1;
      }

      for (int i = 0; i < str2.length(); i++) {
        arr[str2.charAt(i) - 97] -= 1;
      }

      for (int num : arr) {
        if (num != 0) {
          isPossible = false;
          break;
        }
      }

      if (isPossible)
        sb.append("Possible").append('\n');
      else
        sb.append("Impossible").append('\n');
    }

    System.out.println(sb);
  }
}