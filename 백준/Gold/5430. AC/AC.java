import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
  public static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());

    for (int t = 0; t < T; t++) {
      String func = br.readLine();
      int n = Integer.parseInt(br.readLine());
      String input = br.readLine();
      String[] arr = (input.substring(1, input.length() - 1)).split(",");

      LinkedList<String> q = new LinkedList<>();
      for (int i = 0; i < n; i++)
        q.add(arr[i]);

      AC(func, q);
    }

    System.out.println(sb);
  }

  public static void AC(String func, LinkedList<String> q) {
    boolean flag = true;

    for (int i = 0; i < func.length(); i++) {
      char c = func.charAt(i);

      if (c == 'R') {
        flag = !flag;
        continue;
      }

      // D의 경우
      // flag == true (정방향)
      // flag == false (역방향)
      if (flag) {
        if (q.pollFirst() == null) {
          sb.append("error\n");
          return;
        }
      } else {
        if (q.pollLast() == null) {
          sb.append("error\n");
          return;
        }
      }
    }

    // 정상적으로 AC 수행하면
    OK(q, flag);
  }

  public static void OK(LinkedList<String> q, boolean flag) {
    sb.append('[');

    if (q.size() > 0) {
      // 정방향이면
      if (flag) {
        sb.append(q.pollFirst());

        while (!q.isEmpty()) {
          sb.append(',').append(q.pollFirst());
        }
      } else {
        sb.append(q.pollLast());

        while (!q.isEmpty()) {
          sb.append(',').append(q.pollLast());
        }
      }
    }

    sb.append(']').append('\n');
  }
}