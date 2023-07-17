import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int[] arr = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int min = Integer.MAX_VALUE;
    int s = 0, e = N - 1;

    int[] answer = new int[2];
    while (s < e) {
      int sum = arr[s] + arr[e];
      if (min >= Math.abs(sum)) {
        min = Math.abs(sum);
        answer[0] = arr[s];
        answer[1] = arr[e];
      }

      if (sum > 0)
        e--;
      else
        s++;
    }

    System.out.println(answer[0] + " " + answer[1]);
  }
}