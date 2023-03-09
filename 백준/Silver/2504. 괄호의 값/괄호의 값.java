import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    Stack<Character> st = new Stack<>();

    int cnt = 1, answer = 0;
    boolean flag = true;
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);

      if (c == '(') {
        st.push(c);
        cnt *= 2;
      } else if (c == '[') {
        st.push(c);
        cnt *= 3;
      } else {
        if (c == ')') {
          if (st.isEmpty() || st.peek() != '(') {
            flag = false;
            break;
          }

          if (input.charAt(i - 1) == '(') {
            answer += cnt;
          }

          // 분배법칙 생각 !
          st.pop();
          cnt /= 2;
        } else if (c == ']') {
          if (st.isEmpty() || st.peek() != '[') {
            flag = false;
            break;
          }

          if (input.charAt(i - 1) == '[') {
            answer += cnt;
          }

          st.pop();
          cnt /= 3;
        } else {
          flag = false;
          break;
        }
      }
    }

    System.out.println(flag && st.isEmpty() ? answer : 0);
  }
}