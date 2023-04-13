import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int K = Integer.parseInt(st.nextToken());
    int L = Integer.parseInt(st.nextToken());

    LinkedHashSet<String> set = new LinkedHashSet<>();
    for (int i = 0; i < L; i++) {
      String num = br.readLine();

      if (set.contains(num)) {
        set.remove(num);
      }
      set.add(num);
    }

    int cnt = 0;
    for (String str : set) {
      System.out.println(str);
      cnt++;
      if (cnt == K)
        break;
    }
  }
}