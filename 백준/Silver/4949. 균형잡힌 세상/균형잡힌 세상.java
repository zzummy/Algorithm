import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

  public static String stackF(String str) {

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);

      if (c == '(' || c == '[')
        stack.push(c);
      else if (c == ')') {
        if (!stack.isEmpty() && stack.peek() == '(') {
          stack.pop();
        } else
          return "no";
      } else if (c == ']') {
        if (!stack.isEmpty() && stack.peek() == '[') {
          stack.pop();
        } else
          return "no";
      }
    }

    if (stack.isEmpty())
      return "yes";
    else
      return "no";
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while (true) {
      String str = br.readLine();

      if (str.equals("."))
        break;

      sb.append(stackF(str)).append("\n");
    }

    System.out.println(sb);
  }
}