import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

/*
 * 1764. 듣보잡
 */
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    HashMap<String, Integer> map = new HashMap<>();
    List<String> list = new ArrayList<>();

    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    for (int n = 0; n < N; n++) {
      map.put(br.readLine(), 1);
    }

    for (int m = 0; m < M; m++) {
      String name = br.readLine();
      map.put(name, map.getOrDefault(name, 0) + 1);

      if (map.get(name) == 2)
        list.add(name);
    }

    StringBuilder sb = new StringBuilder();
    Collections.sort(list);
    sb.append(list.size()).append('\n');
    for (String s : list)
      sb.append(s).append('\n');
    System.out.println(sb.toString());

  }
}