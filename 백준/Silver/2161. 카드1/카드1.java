import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// https://www.acmicpc.net/problem/2161

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    Queue<Integer> q = new LinkedList<>();
    for (int i = 1; i <= N; i++)
      q.add(i);

    String answer = "";
    while (q.size() != 1) {
      answer += q.poll().toString() + " ";
      q.add(q.poll());
    }
    System.out.println(answer + q.poll());
  }
}