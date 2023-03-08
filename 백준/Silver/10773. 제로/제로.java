import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int K = Integer.parseInt(br.readLine());
    Stack<Integer> st = new Stack<>();
    for (int k = 0; k < K; k++) {
      int n = Integer.parseInt(br.readLine());
      if (n == 0)
        st.pop();
      else
        st.push(n);
    }

    int answer = 0;
    while (!st.isEmpty()) {
      answer += st.pop();
    }
    System.out.println(answer);
  }
}