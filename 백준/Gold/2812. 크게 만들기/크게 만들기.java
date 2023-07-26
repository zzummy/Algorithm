import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    char[] arr = br.readLine().toCharArray();

    Deque<Character> dq = new LinkedList<>();

    for (int i = 0; i < arr.length; i++) {
      // deque의 맨 마지막 값이 추가될 arr[i] 값 보다 작으면 삭제 처리 (K++) , arr[i] 추가
      // K > 0
      // !dq.isEmpty()
      while (K > 0 && !dq.isEmpty() && dq.getLast() < arr[i]) {
        dq.pollLast();
        K--;
      }

      dq.addLast(arr[i]);
    }

    // 숫자가 중복되서 나오는 경우 ex) 55555
    // 삭제 과정없이 모두 추가되므로 출력할 때, - K 만큼만 출력해주면 됨
    StringBuilder sb = new StringBuilder();
    while (dq.size() > K) {
      sb.append(dq.pollFirst());
    }

    System.out.println(sb);

  }
}