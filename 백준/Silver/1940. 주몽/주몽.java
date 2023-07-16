import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());

    int[] arr = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++)
      arr[i] = Integer.parseInt(st.nextToken());

    int answer = 0;
    for (int s = 0; s < N; s++) {
      int sum = 0;
      int e = s + 1;

      while (e < N) {
        sum = arr[s]; // 초기화 해줘야함
        sum += arr[e++];

        if (sum == M) {
          answer++;
          break;
        }
      }
    }

    System.out.println(answer);
  }
}