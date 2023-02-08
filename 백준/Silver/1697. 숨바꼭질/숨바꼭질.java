import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  static int N, K;
  static int[] map = new int[100001];

  public static void BFS() {
    Queue<Integer> q = new LinkedList<>();
    q.offer(N);
    while (!q.isEmpty()) {
      int now = q.poll();

      if (now == K)
        break;

      if (now - 1 >= 0 && map[now - 1] == 0) {
        q.offer(now - 1);
        map[now - 1] = map[now] + 1;
      }
      if (now + 1 < 100001 && map[now + 1] == 0) {
        q.offer(now + 1);
        map[now + 1] = map[now] + 1;
      }
      if (now * 2 < 100001 && map[now * 2] == 0) {
        q.offer(now * 2);
        map[now * 2] = map[now] + 1;
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    K = sc.nextInt();
    BFS();
    System.out.println(map[K]);
  }
}