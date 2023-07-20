import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] arr = new int[N];
    long max = Integer.MIN_VALUE;

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      max = Math.max(max, arr[i]);
    }

    long min = 0;
    while (min < max) {
      long mid = (min + max) / 2;

      long sum = 0;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] > mid)
          sum += arr[i] - mid;
      }

      if (sum < M)
        max = mid;
      else
        min = mid + 1;
    }

    System.out.println(min - 1);
  }
}