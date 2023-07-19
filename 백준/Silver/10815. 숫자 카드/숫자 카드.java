import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  static int N, M;
  static int[] arr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    arr = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr);

    M = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < M; i++) {
      int num = Integer.parseInt(st.nextToken());

      if (binarySearch(num)) {
        sb.append("1 ");
      } else
        sb.append("0 ");
    }

    System.out.println(sb);
  }

  public static boolean binarySearch(int num) {
    int lt = 0, rt = N - 1;

    while (lt <= rt) {
      int mid = (lt + rt) / 2;
      if (arr[mid] > num) {
        rt = mid - 1;
      } else if (arr[mid] < num) {
        lt = mid + 1;
      } else {
        return true;
      }
    }

    return false;
  }
}