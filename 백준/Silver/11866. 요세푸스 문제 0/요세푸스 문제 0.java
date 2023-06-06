import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    StringBuilder sb = new StringBuilder();
    sb.append("<");
    Queue<Integer> q = new LinkedList<>();

    for (int i = 1; i <= N; i++) {
      q.add(i);
    }

    int idx = 1;
    while (q.size() > 1) {
      if (idx++ % K == 0) {
        sb.append(q.poll()).append(", ");
      } else {
        q.add(q.poll());
      }
    }

    sb.append(q.poll()).append(">");
    System.out.println(sb);
  }
}