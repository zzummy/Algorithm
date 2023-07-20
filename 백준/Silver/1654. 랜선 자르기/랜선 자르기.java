import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int K = Integer.parseInt(st.nextToken()); // 가지고 있는 랜선의 개수
    int N = Integer.parseInt(st.nextToken()); // 필요한 랜선의 개수

    int[] arr = new int[K];
    long max = Integer.MIN_VALUE;
    for (int i = 0; i < K; i++) {
      arr[i] = Integer.parseInt(br.readLine());
      max = Math.max(max, arr[i]);
    }

    // 반드시 max + 1 이어야함
    // min , max 둘 다 0일 경우, 반환되는 값은 0이므로
    // 탐색 범위를 0 ~ max + 1
    max++;

    // 필요한 랜선의 개수 = N
    // mid (자를 길이)로 잘랐을 때의 개수(count)를 N과 비교
    // N > count 이면, 잘라야하는 길이를 줄여야하므로 최대 길이를 줄임.
    // 반대로 N <= count, 길이를 늘려야하므로 최소 길이를 늘림.

    long min = 0;
    while (min < max) {
      long mid = (min + max) / 2;

      long count = 0;
      for (int i = 0; i < K; i++) {
        count += arr[i] / mid;
      }

      if (N > count)
        max = mid;
      else
        min = mid + 1;

    }

    System.out.println(min - 1);
  }
}