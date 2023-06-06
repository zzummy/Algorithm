import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// https://www.acmicpc.net/problem/1935

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String input = br.readLine();

    // A ~ Z까지 순서대로 영대문자 사용
    double[] arr = new double[N];
    for (int i = 0; i < N; i++) {
      arr[i] = Double.parseDouble(br.readLine());
    }

    Stack<Double> st = new Stack<>();
    for (int i = 0; i < input.length(); i++) {
      // 알파벳이면 stack에 넣기
      if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
        st.push(arr[input.charAt(i) - 'A']);
      } else {
        // s - r
        // 두번째로 뺀 값 - 첫번째로 뺀 값
        double r = st.pop();
        double s = st.pop();

        switch (input.charAt(i)) {
          case '+':
            st.push(s + r);
            break;
          case '-':
            st.push(s - r);
            break;
          case '/':
            st.push(s / r);
            break;
          case '*':
            st.push(s * r);
            break;
        }
      }
    }

    System.out.printf("%.2f", st.pop());
  }
}