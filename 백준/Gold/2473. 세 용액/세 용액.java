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
    for (int i = 0; i < N; i++)
      arr[i] = Long.parseLong(st.nextToken());

    Arrays.sort(arr);

    long min = Long.MAX_VALUE;
    long[] answer = new long[3];

    // 두 용액처럼 ,,
    // e는 오른쪽에서 하나씩 감소하고
    // s를 하나씩 늘려가면서 m(mid)를 i+1 해주면 될 것 같다
    // 대신 조건은 m < e

    // 세가지의 경우를 구해야하니까 s의 범위는 N-2
    for (int s = 0; s < N - 2; s++) {
      int m = s + 1;
      int e = N - 1;

      while (m < e) {
        long sum = arr[s] + arr[m] + arr[e];
        if (min >= Math.abs(sum)) {
          min = Math.abs(sum);
          answer[0] = arr[s];
          answer[1] = arr[m];
          answer[2] = arr[e];
        }

        // 두 용액과 달리 sum <= 0인 경우에 m++를 해준다.
        // s는 for문을 통해 하나씩 늘어가고 있으므로 고정된 값
        if (sum > 0)
          e--;
        else
          m++;
      }
    }

    // Arrays.sort(answer);
    System.out.println(answer[0] + " " + answer[1] + " " + answer[2]);
  }
}