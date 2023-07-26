import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    for (int n = 0; n < N; n++) {
      String input = br.readLine();
      Stack<Character> stack = new Stack<>();

      for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);

        // ( : 스택에 넣기
        // ) : 맨 위에 )인지 확인하고 빼기
        if (stack.isEmpty()) {
          stack.push(c);
        } else if (stack.peek() == '(' && c == ')') {
          stack.pop();
        } else {
          stack.push(c);
        }
      }

      if (stack.size() == 0) {
        sb.append("YES").append("\n");
      } else {
        sb.append("NO").append("\n");
      }
    }

    System.out.println(sb);
  }
}