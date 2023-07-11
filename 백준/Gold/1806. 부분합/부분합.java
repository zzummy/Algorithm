import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int S = Integer.parseInt(st.nextToken());

    int[] arr = new int[N];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int sum = 0, min = Integer.MAX_VALUE;
    int lt = 0, rt = 0;

    while (true) {
      if (sum >= S) {
        sum -= arr[lt];
        min = Math.min(rt - lt, min);
        lt++;
      } else if (rt >= N) {
        break;
      } else {
        sum += arr[rt++];
      }
    }

    System.out.println(min == Integer.MAX_VALUE ? 0 : min);
  }
}