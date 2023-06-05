import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    Deque<Integer> q = new LinkedList<>();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      String[] str = br.readLine().split(" ");
      String cmd = str[0];

      switch (cmd) {
        case "push":
          q.offer(Integer.parseInt(str[1]));
          break;
        case "pop":
          Integer item = q.poll();
          if (item == null)
            sb.append(-1).append('\n');
          else
            sb.append(item).append('\n');
          break;
        case "size":
          sb.append(q.size()).append('\n');
          break;
        case "empty":
          if (!q.isEmpty())
            sb.append(0).append('\n');
          else
            sb.append(1).append('\n');
          break;
        case "front":
          if (q.peek() != null)
            sb.append(q.peek()).append('\n');
          else
            sb.append(-1).append('\n');
          break;
        case "back":
          if (q.peekLast() != null)
            sb.append(q.peekLast()).append('\n');
          else
            sb.append(-1).append('\n');
          break;
      }
    }

    System.out.println(sb);
  }

}