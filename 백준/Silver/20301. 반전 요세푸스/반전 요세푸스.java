import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    Deque<Integer> dq = new LinkedList<>();
    for (int i = 1; i <= N; i++) {
      dq.offer(i);
    }

    StringBuilder sb = new StringBuilder();
    boolean rotate = true;
    int idx = 1;
    int cnt = 0;
    while (!dq.isEmpty()) {
      // true일 때 ->
      // 뒤로 넣기
      if (rotate) {
        int tmp = dq.pollFirst();
        if (idx++ % K == 0) {
          sb.append(tmp).append('\n');
          cnt++;
        } else {
          dq.offerLast(tmp);
        }
      } else {
        // false <-
        // 앞으로 넣기
        int tmp = dq.pollLast();
        if (idx++ % K == 0) {
          sb.append(tmp).append('\n');
          cnt++;
        } else {
          dq.offerFirst(tmp);
        }
      }

      if (cnt != 0 && cnt % M == 0) {
        rotate = !rotate;
        cnt = 0;
      }
    }

    System.out.println(sb);
  }
}