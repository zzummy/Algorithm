import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] arr = new int[N];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++)
      arr[i] = Integer.parseInt(st.nextToken());

    // 누적합 배열
    int[] sum = new int[N + 1];
    sum[0] = 0;

    for (int i = 1; i <= N; i++) {
      sum[i] = sum[i - 1] + arr[i - 1];
    }

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    while (M-- > 0) {
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());

      bw.write(sum[j] - sum[i - 1] + "\n");
    }

    bw.flush();
    bw.close();
  }
}