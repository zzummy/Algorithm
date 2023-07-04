import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());

    PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
      @Override
      public int compare(Integer a, Integer b) {
        int A = Math.abs(a);
        int B = Math.abs(b);
        if (A > B)
          return A - B;
        else if (A == B) {
          if (a > b)
            return 1;
          else
            return -1;
        } else
          return -1;
      }
    });

    while (N-- > 0) {
      int input = Integer.parseInt(br.readLine());

      if (input != 0) {
        q.offer(input);
      } else {
        if (!q.isEmpty())
          sb.append(q.poll()).append('\n');
        else
          sb.append("0\n");
      }
    }

    System.out.println(sb);
  }
}