import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    boolean[] answer = new boolean[T];
    for (int t = 0; t < T; t++) {
      String input = br.readLine();
      Stack<Character> st = new Stack<>();

      for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);

        if (st.isEmpty())
          st.push(c);
        else if (c == ')' && st.peek() == '(')
          st.pop();
        else
          st.push(c);
      }

      if (st.isEmpty())
        answer[t] = true;
    }

    for (int i = 0; i < T; i++)
      System.out.println(answer[i] ? "YES" : "NO");
  }
}