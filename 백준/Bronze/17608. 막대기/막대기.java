import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    Stack<Integer> stack = new Stack<>();

    for (int n = 0; n < N; n++) {
      int temp = Integer.parseInt(br.readLine());

      while (!stack.isEmpty() && temp >= stack.peek()) {
        stack.pop();
      }
      stack.push(temp);
    }

    System.out.println(stack.size());
  }
}