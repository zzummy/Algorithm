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

    int s = 0, e = 0;
    int max = Integer.MIN_VALUE;
    int[] cnt = new int[100001];
    while (e < N) {
      while (e < N && cnt[arr[e]] + 1 <= K) {
        cnt[arr[e]]++;
        e++;
      }

      int len = e - s;
      max = Math.max(max, len);
      cnt[arr[s]]--;
      s++;
    }

    System.out.println(max);
  }
}