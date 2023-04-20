import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/*
 * 1269. 대형 차집합
 */
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());

    HashSet<Integer> setA = new HashSet<>();
    HashSet<Integer> setB = new HashSet<>();
    st = new StringTokenizer(br.readLine());
    for (int a = 0; a < A; a++) {
      setA.add(Integer.parseInt(st.nextToken()));
    }

    st = new StringTokenizer(br.readLine());
    for (int b = 0; b < B; b++) {
      setB.add(Integer.parseInt(st.nextToken()));
    }

    int cnt = 0;
    for (int na : setA) {
      if (!setB.contains(na))
        cnt++;
    }

    for (int nb : setB) {
      if (!setA.contains(nb))
        cnt++;
    }

    System.out.println(cnt);
  }
}