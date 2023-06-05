import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1158

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    Queue<Integer> q = new LinkedList<>();
    for (int i = 1; i <= N; i++)
      q.add(i);

    int idx = 1;
    String answer = "<";
    while (q.size() > 1) {
      int tmp = q.poll();
      if (idx++ % K == 0) {
        answer += tmp + ", ";
      } else {
        q.offer(tmp);
      }
    }

    answer += q.poll() + ">";
    System.out.println(answer);
  }
}