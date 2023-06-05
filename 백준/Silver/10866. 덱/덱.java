import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    // StringTokenizer
    int N = Integer.parseInt(br.readLine());

    Deque<Integer> dq = new LinkedList<>();
    for (int i = 0; i < N; i++) {
      String[] input = br.readLine().split(" ");

      switch (input[0]) {
        case "push_front":
          dq.addFirst(Integer.parseInt(input[1]));
          break;
        case "push_back":
          dq.offer(Integer.parseInt(input[1]));
          break;
        case "pop_front":
          Integer i1 = dq.poll();
          if (i1 == null)
            sb.append(-1).append('\n');
          else
            sb.append(i1).append('\n');
          break;
        case "pop_back":
          Integer i2 = dq.pollLast();
          if (i2 == null)
            sb.append(-1).append('\n');
          else
            sb.append(i2).append('\n');
          break;
        case "size":
          sb.append(dq.size()).append('\n');
          break;
        case "empty":
          if (dq.isEmpty())
            sb.append(1).append('\n');
          else
            sb.append(0).append('\n');
          break;
        case "front":
          Integer i3 = dq.peek();
          if (i3 == null)
            sb.append(-1).append('\n');
          else
            sb.append(i3).append('\n');
          break;
        case "back":
          Integer i4 = dq.peekLast();
          if (i4 == null)
            sb.append(-1).append('\n');
          else
            sb.append(i4).append('\n');
          break;
      }
    }

    System.out.println(sb);
  }
}
