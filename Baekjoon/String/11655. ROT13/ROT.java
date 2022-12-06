import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROT{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      int n = str.charAt(i);

      // 대문자
      if (n >= 65 && n <= 90) {
        n += 13;

        // 13자리 옮긴 후, Z를 넘어가면 안되니까
        if (n > 90) {
          int k = n - 91;
          n = 65 + k;
        }
      }
      // 소문자
      else if (n >= 97 && n <= 122) {
        n += 13;

        if (n > 122) {
          int k = n - 123;
          n = 97 + k;
        }
      }

      sb.append((char) n);
    }
    System.out.println(sb);
  }
}