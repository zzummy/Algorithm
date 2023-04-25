import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static int twoPointer(int[] arr, int N, int M) {
    int answer = 0, sum = 0;
    int s = 0, e = 0; // s <= e

    while (s < N) {
      // 연속된 합sum이 M보다 크거나 같으면, 맨 왼쪽 값(arr[s]) 빼주고 s++
      if (sum >= M)
        sum -= arr[s++];
      // 맨 끝에 도착했으면 종료
      else if (e == N)
        break;
      // sum < M
      else
        sum += arr[e++];

      if (sum == M)
        answer++;
    }

    return answer;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[] arr = new int[N];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    System.out.println(twoPointer(arr, N, M));
  }
}