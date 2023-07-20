import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int M = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());

    int[] arr = new int[N];
    st = new StringTokenizer(br.readLine());

    int max = 0;
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());

      max = Math.max(max, arr[i]);
    }

    int min = 1; // 과자의 길이는 1부터
    while (min <= max) {
      int mid = (max + min) / 2;

      int cnt = 0;
      for (int i = 0; i < N; i++) {
        cnt += arr[i] / mid;
      }

      if (cnt >= M)
        min = mid + 1;
      else
        max = mid - 1;
    }

    System.out.println(max);
  }
}