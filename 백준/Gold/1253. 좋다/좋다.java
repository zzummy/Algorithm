import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  static int N, Good;
  static int[] arr;

  public static void solution(int idx) {
    int p1 = 0, p2 = N - 1;
    int target = arr[idx];

    while (p1 < p2) {
      if (p1 == idx)
        p1++;
      else if (p2 == idx)
        p2--;
      else {
        // target이 arr[p1] + arr[p2] 보다 크면 p1++해서 값 증가
        if (target > arr[p1] + arr[p2])
          p1++;
        // target이 arr[p1] + arr[p2] 보다 작으면 p2--해서 값 감소
        else if (target < arr[p1] + arr[p2])
          p2--;
        else {
          Good++;
          return;
        }
      }

    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);

    for (int i = 0; i < N; i++) {
      solution(i);
    }

    System.out.println(Good);
  }
}