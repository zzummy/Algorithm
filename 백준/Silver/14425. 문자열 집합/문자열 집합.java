import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/*
 * 14425. 문자열 집합
 */
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    HashSet<String> set = new HashSet<>();
    // 집합 S에 포함되어 있는 N개의 문자열
    for (int n = 0; n < N; n++) {
      set.add(br.readLine());
    }

    int cnt = 0;
    // 검사해야 하는 M개의 문자열
    for (int m = 0; m < M; m++) {
      String str = br.readLine();
      if (set.contains(str))
        cnt++;
    }

    System.out.println(cnt);
  }
}