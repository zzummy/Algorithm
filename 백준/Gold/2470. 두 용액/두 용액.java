import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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

    int answer = Integer.MAX_VALUE;
    int[] list = new int[2];
    int s = 0, e = N - 1;

    Arrays.sort(arr);

    while (s < e) {
      int sum = arr[s] + arr[e];
      if (answer > Math.abs(sum)) {
        answer = Math.abs(sum);
        list[0] = arr[s];
        list[1] = arr[e];
      }

      if (sum > 0)
        e--;
      else
        s++;
    }

    System.out.println(list[0] + " " + list[1]);
  }
}