import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    LinkedList<Integer> dq = new LinkedList<>();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());

      switch (n) {
        case 1:
          int num1 = Integer.parseInt(st.nextToken());
          dq.offerFirst(num1);
          break;
        case 2:
          int num2 = Integer.parseInt(st.nextToken());
          dq.offerLast(num2);
          break;
        case 3:
          sb.append(dq.isEmpty() ? "-1" : dq.pollFirst()).append('\n');
          break;
        case 4:
          sb.append(dq.isEmpty() ? "-1" : dq.pollLast()).append('\n');
          break;
        case 5:
          sb.append(dq.size()).append('\n');
          break;
        case 6:
          sb.append(dq.isEmpty() ? 1 : 0).append('\n');
          break;
        case 7:
          sb.append(dq.peekFirst() == null ? -1 : dq.peekFirst()).append('\n');
          break;
        case 8:
          sb.append(dq.peekLast() == null ? -1 : dq.peekLast()).append('\n');
          break;
      }
    }
    System.out.print(sb);
  }
}