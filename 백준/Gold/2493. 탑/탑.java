import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    Stack<int[]> stack = new Stack<>();

    for (int n = 1; n <= N; n++) {
      int len = Integer.parseInt(st.nextToken());

      while (!stack.isEmpty()) {
        if (stack.peek()[1] > len) {
          System.out.print(stack.peek()[0] + " ");
          break;
        } else {
          stack.pop();
        }
      }

      if (stack.isEmpty()) {
        System.out.print(0 + " ");
      }

      // [ 탑 번호, 길이 ]
      stack.push(new int[] { n, len });
    }
  }
}