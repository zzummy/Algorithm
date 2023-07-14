import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    int[] arr = new int[N];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int max = Integer.MIN_VALUE;
    for (int s = 0; s <= N - K; s++) {
      int sum = 0;
      for (int e = s; e < s + K; e++) {
        sum += arr[e];
      }

      max = Math.max(max, sum);
    }

    System.out.println(max);
  }
}