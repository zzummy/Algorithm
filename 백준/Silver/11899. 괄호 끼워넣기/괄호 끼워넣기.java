import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split("");

    Stack<String> st = new Stack<>();
    st.push(input[0]);
    for (int i = 1; i < input.length; i++) {
      String tmp = input[i];

      if (tmp.equals("(")) {
        st.push(tmp);
      } else {
        if (st.size() > 0 && st.peek().equals("("))
          st.pop();
        else
          st.push(tmp);
      }
    }

    System.out.println(st.size());
  }
}