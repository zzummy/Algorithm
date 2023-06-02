import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int answer = 0;
    for (int i = 0; i < N; i++) {
      char[] arr = br.readLine().toCharArray();
      Stack<Character> stack = new Stack<>();

      // 첫번째 단어 push
      stack.push(arr[0]);
      for (int j = 1; j < arr.length; j++) {
        char tmp = arr[j];

        if (!stack.isEmpty() && stack.peek() == tmp) {
          stack.pop();
          continue;
        }

        stack.push(tmp);
      }

      if (stack.isEmpty()) {
        answer++;
      }
    }

    System.out.println(answer);
  }
}