import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
      @Override
      public int compare(Integer a, Integer b) {
        return b - a;
      }
    });

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(br.readLine());

      // 자연수 : 배열에 추가
      if (num != 0) {
        q.add(num);
      }
      // 0 : 배열에서 가장 큰 값 출력 후, 배열에서 제거
      else {
        sb.append(q.peek() == null ? 0 : q.poll()).append("\n");
      }
    }

    System.out.println(sb);
  }
}