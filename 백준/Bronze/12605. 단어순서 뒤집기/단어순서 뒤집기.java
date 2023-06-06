import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    for (int i = 1; i <= N; i++) {
      Stack<String> st = new Stack<>();
      String[] input = br.readLine().split(" ");

      for (int j = 0; j < input.length; j++) {
        st.push(input[j]);
      }

      StringBuilder sb = new StringBuilder();
      sb.append("Case #").append(i + ": ");

      while (!st.isEmpty()) {
        sb.append(st.pop()).append(" ");
      }

      System.out.println(sb);
    }

  }
}