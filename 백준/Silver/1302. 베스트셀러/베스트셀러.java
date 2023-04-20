import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
 * 1302. 베스트셀러
 */
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    HashMap<String, Integer> map = new HashMap<>();
    for (int n = 0; n < N; n++) {
      String book = br.readLine();
      map.put(book, map.getOrDefault(book, 0) + 1);
    }

    int max = Integer.MIN_VALUE;
    ArrayList<String> list = new ArrayList<>();
    for (String name : map.keySet()) {
      max = Math.max(max, map.get(name));
      list.add(name);
    }

    Collections.sort(list);
    for (String name : list) {
      if (map.get(name) == max) {
        System.out.println(name);
        break;
      }
    }
  }
}