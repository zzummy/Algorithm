import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    Queue<Integer> q = new LinkedList<>();
    int last = 0;
    for (int n = 0; n < N; n++) {
      String[] input = br.readLine().split(" ");
      String command = input[0];

      switch (command) {
        case "push":
          last = Integer.parseInt(input[1]);
          q.offer(last);
          break;
        case "pop":
          System.out.println(q.isEmpty() ? -1 : q.poll());
          break;
        case "size":
          System.out.println(q.size());
          break;
        case "empty":
          System.out.println(q.isEmpty() ? 1 : 0);
          break;
        case "front":
          System.out.println(q.isEmpty() ? -1 : q.peek());
          break;
        case "back":
          System.out.println(q.isEmpty() ? -1 : last);
          break;
      }
    }
  }
}