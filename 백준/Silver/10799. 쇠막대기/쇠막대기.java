import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Stack<Character> stack = new Stack<>();
    String str = br.readLine();
    int answer = 0;

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c == '(')
        stack.push(c);
      else {
        // ()으로 인접한 쌍이면 레이저이므로, pop
        if (str.charAt(i - 1) == '(') {
          stack.pop();
          answer += stack.size();
        } else {
          stack.pop();
          answer++;
        }
      }
    }

    System.out.println(answer);
  }
}