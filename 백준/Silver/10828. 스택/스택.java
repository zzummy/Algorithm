import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    Stack<Integer> st = new Stack<>();
    StringBuilder sb = new StringBuilder();

    for (int n = 0; n < N; n++) {
      String[] input = br.readLine().split(" ");

      switch (input[0]) {
        case "push":
          st.push(Integer.parseInt(input[1]));
          break;
        case "top":
          sb.append(st.isEmpty() ? -1 : st.peek()).append('\n');
          break;
        case "size":
          sb.append(st.size()).append('\n');
          break;
        case "empty":
          sb.append(st.isEmpty() ? 1 : 0).append('\n');
          break;
        case "pop":
          sb.append(st.isEmpty() ? -1 : st.pop()).append('\n');
          break;
        default:
          break;
      }
    }

    System.out.println(sb);
  }
}