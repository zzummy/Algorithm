import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());

    TreeSet<Integer> tset = new TreeSet<>();

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < A; i++) {
      tset.add(Integer.parseInt(st.nextToken()));
    }

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < B; i++) {
      int n = Integer.parseInt(st.nextToken());
      if (tset.contains(n))
        tset.remove(n);
    }

    StringBuilder sb = new StringBuilder();
    if (tset.size() > 0) {
      sb.append(tset.size()).append('\n');
      for (Integer n : tset)
        sb.append(n + " ");
    } else
      sb.append(0);

    System.out.println(sb);
  }
}