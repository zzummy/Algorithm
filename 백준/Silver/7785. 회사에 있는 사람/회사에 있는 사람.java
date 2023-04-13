import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
 * 7785. 회사에 있는 사람
 */
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashSet<String> set = new HashSet<>();

    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String name = st.nextToken();
      String state = st.nextToken();
      if (state.equals("enter")) {
        set.add(name);
      } else {
        set.remove(name);
      }
    }

    List<String> list = new ArrayList<String>(set);
    Collections.sort(list, Collections.reverseOrder());
    for (String s : list)
      System.out.println(s);
  }
}