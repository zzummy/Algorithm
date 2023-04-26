import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static int twoPointer(int n, int x, int[] arr) {
    int cnt = 0, sum = 0;
    int s = 0, e = n - 1;

    while (s < e) {
      sum = arr[s] + arr[e];

      if (sum == x)
        cnt++;

      if (sum <= x)
        s++;
      else
        e--;
    }

    return cnt;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    int x = Integer.parseInt(br.readLine());

    Arrays.sort(arr);
    System.out.println(twoPointer(n, x, arr));
  }
}