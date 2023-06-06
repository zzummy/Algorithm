import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1021

// 2번, 3번 연산이 최소가 되야함 
// 1번 연산은 상관 없음 
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    LinkedList<Integer> dq = new LinkedList<Integer>();
    for (int i = 1; i <= N; i++)
      dq.offer(i);

    int[] seq = new int[M];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++)
      seq[i] = Integer.parseInt(st.nextToken());

    int cnt = 0;

    for (int i = 0; i < M; i++) {
      int idx = dq.indexOf(seq[i]);
      int halfIdx;

      if (dq.size() % 2 == 0)
        halfIdx = dq.size() / 2 - 1;
      else
        halfIdx = dq.size() / 2;

      if (idx <= halfIdx) {
        // 2번 연산
        for (int j = 0; j < idx; j++) {
          dq.offerLast(dq.pollFirst());
          cnt++;
        }
      } else {
        // 3번 연산
        for (int j = 0; j < dq.size() - idx; j++) {
          dq.offerFirst(dq.pollLast());
          cnt++;
        }
      }

      dq.pollFirst();
    }

    System.out.println(cnt);
  }
}