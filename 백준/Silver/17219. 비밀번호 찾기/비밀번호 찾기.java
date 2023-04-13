import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
 * 17219. 비밀번호 찾기
 */
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] arr = br.readLine().split(" ");
    int N = Integer.parseInt(arr[0]);
    int M = Integer.parseInt(arr[1]);

    HashMap<String, String> map = new HashMap<>();
    for (int n = 0; n < N; n++) {
      String[] input = br.readLine().split(" ");
      map.put(input[0], input[1]);
    }

    StringBuilder sb = new StringBuilder();
    for (int m = 0; m < M; m++) {
      sb.append(map.get(br.readLine())).append("\n");
    }

    System.out.println(sb.toString());
  }
}