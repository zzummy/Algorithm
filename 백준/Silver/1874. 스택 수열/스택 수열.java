import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    Stack<Integer> stack = new Stack<>();
    StringBuilder sb = new StringBuilder();
    boolean flag = true;

    int i = 1;
    for (int t = 0; t < T; t++) {
      int k = Integer.parseInt(br.readLine());

      for (; i <= k; i++) {
        stack.push(i);
        sb.append("+").append("\n");
      }

      if (stack.peek() == k) {
        stack.pop();
        sb.append("-").append("\n");
      } else {
        flag = false;
        break;
      }
    }

    System.out.println(flag ? sb : "NO");
  }
}