import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(arr);

    int s = 0, e = 0;
    int answer = Integer.MAX_VALUE;

    while (s <= e && e < N) {
      int sub = arr[e] - arr[s];
      if (sub < M) {
        e++;
      } else {
        answer = Math.min(answer, sub);
        s++;
      }
    }

    System.out.println(answer);
  }
}