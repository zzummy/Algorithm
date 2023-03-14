import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String input = br.readLine();
    int N = Integer.parseInt(br.readLine());
    Stack<Character> left = new Stack<>();
    Stack<Character> right = new Stack<>();
    for (int i = 0; i < input.length(); i++) {
      left.push(input.charAt(i));
    }

    for (int n = 0; n < N; n++) {
      String str = br.readLine();
      char c = str.charAt(0);
      if (c == 'P') {
        left.push(str.charAt(2));
      } else if (c == 'L') {
        if (!left.isEmpty()) {
          right.push(left.pop());
        }
      } else if (c == 'D') {
        if (!right.isEmpty()) {
          left.push(right.pop());
        }
      } else if (c == 'B') {
        if (!left.isEmpty()) {
          left.pop();
        }
      }
    }

    while (!right.isEmpty()) {
      left.push(right.pop());
    }

    while (!left.isEmpty()) {
      sb.append(left.pop());
    }

    sb.reverse();
    System.out.println(sb);
  }
}