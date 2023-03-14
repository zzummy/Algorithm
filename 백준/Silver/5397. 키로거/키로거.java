import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    Stack<Character> stack1 = new Stack<>();
    // < 왼쪽으로 이동시킬 때 오른쪽에 남은 문자를 다른 스택에 넣어준다.
    // > 오른쪽으로 이동할 때 stack2에 남아있는 문자가 있다면, 가져와서 stack1에 넣어줘야 한다.
    Stack<Character> stack2 = new Stack<>();

    for (int n = 0; n < N; n++) {
      StringBuilder sb = new StringBuilder();
      String input = br.readLine();

      for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);

        if (c == '<') {
          if (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
          }
        } else if (c == '>') {
          if (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
          }
        } else if (c == '-') {
          if (!stack1.isEmpty()) {
            stack1.pop();
          }
        } else {
          stack1.push(c);
        }
      }

      while (!stack2.isEmpty()) {
        stack1.push(stack2.pop());
      }

      while (!stack1.isEmpty()) {
        sb.append(stack1.pop());
      }

      sb.reverse();
      bw.write(sb + "\n");
    }
    bw.flush();
    bw.close();
  }

}