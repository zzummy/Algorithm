import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    // 스택이 비어있으면, 현재 값의 인덱스 push
    // 스택이 비어있지 않으면서
    // 현재 값 < stack.peek()이면, 현재 값의 인덱스를 push
    // 현재 값 > stack.peek() 이면, stack pop하면서
    // 해당 인덱스의 값을 현재 값으로 바꿔준다.

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    Stack<Integer> stack = new Stack<>();
    int[] output = new int[N];

    for (int i = 0; i < N; i++) {
      output[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < N; i++) {
      while (!stack.isEmpty() && output[i] > output[stack.peek()]) {
        output[stack.pop()] = output[i];
      }

      stack.push(i);
    }

    // 마지막
    while (!stack.isEmpty()) {
      output[stack.pop()] = -1;
    }

    StringBuilder sb = new StringBuilder();
    for (int n : output)
      sb.append(n).append(" ");

    System.out.println(sb);
  }
}