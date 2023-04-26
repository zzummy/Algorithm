import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] A = new int[N];
    int[] B = new int[M];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++) {
      B[i] = Integer.parseInt(st.nextToken());
    }

    // ArrayList<Integer> answer = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    int a = 0, b = 0;
    while (a < N && b < M) {
      if (A[a] <= B[b])
        sb.append(A[a++] + " ");
      else
        sb.append(B[b++] + " ");
    }

    while (a < N)
      sb.append(A[a++] + " ");

    while (b < M)
      sb.append(B[b++] + " ");

    System.out.println(sb.toString());
  }
}