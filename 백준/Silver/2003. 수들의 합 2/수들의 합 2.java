import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2003

public class Main {
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

    int sum = 0, answer = 0;
    int lt = 0, rt = 0;
    while (true) {
      if (sum >= M)
        sum -= arr[lt++];
      else if (rt >= N)
        break;
      else
        sum += arr[rt++];

      if (sum == M)
        answer++;
    }

    System.out.println(answer);
  }
}