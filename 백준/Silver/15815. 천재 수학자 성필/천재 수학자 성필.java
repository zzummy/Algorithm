import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] input = br.readLine().toCharArray();
    Stack<Integer> st = new Stack<>();

    for (int i = 0; i < input.length; i++) {
      char tmp = input[i];

      if (tmp >= '0')
        st.push(tmp - '0');
      else {
        int n1 = st.pop();
        int n2 = st.pop();

        switch (tmp) {
          case '+':
            st.push(n1 + n2);
            break;
          case '-':
            st.push(n2 - n1);
            break;
          case '*':
            st.push(n1 * n2);
            break;
          case '/':
            st.push(n2 / n1);
            break;
        }
      }
    }

    System.out.println(st.pop());

  }

}