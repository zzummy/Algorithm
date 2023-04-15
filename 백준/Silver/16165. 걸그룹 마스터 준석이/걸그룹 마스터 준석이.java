import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    HashMap<String, String> map = new HashMap<>();
    for (int n = 0; n < N; n++) {
      String team = br.readLine();
      int num = Integer.parseInt(br.readLine());

      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < num; i++) {
        sb.append(br.readLine() + " ");
      }

      map.put(team, sb.toString());
    }

    for (int m = 0; m < M; m++) {
      String str = br.readLine();
      int q = Integer.parseInt(br.readLine());

      if (q == 0) { // team
        String[] arr = map.get(str).split(" ");
        Arrays.sort(arr);
        for (String name : arr)
          System.out.println(name);
      } else if (q == 1) {
        for (String team : map.keySet()) {
          String s = map.get(team);
          if (s.contains(str))
            System.out.println(team);
        }
      }
    }
  }
}