import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    long[] arr = new long[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Long.parseLong(st.nextToken());
    }

    Arrays.sort(arr);

    long max = 0;
    if (N % 2 == 0) {
      // N이 짝수일 경우, 정렬했으므로 max값을 arr[i] + arr[N-1-i] 중 찾으면 됨
      for (int i = 0; i < N / 2; i++) {
        max = Math.max(max, arr[i] + arr[N - 1 - i]);
      }
    } else {
      // 홀수일 경우, 최초 max를 arr[N-1]
      max = arr[N - 1];
      for (int i = 0; i < (N - 1) / 2; i++) {
        max = Math.max(max, arr[i] + arr[N - 2 - i]);
      }
    }

    System.out.println(max);
  }
}