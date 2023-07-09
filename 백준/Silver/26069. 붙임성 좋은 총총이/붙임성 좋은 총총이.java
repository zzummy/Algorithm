import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/*
 * 26069. 붙임성 좋은 총총이
 */

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    // 동명이인 없으므로 중복 허용 X => Set 사용
    // 정렬 필요 없으므로 HashSet 사용 !
    HashSet<String> set = new HashSet<>();

    // 첫번째로 춤추는 사람은 ChongChong이므로, set에 바로 넣어줌
    set.add("ChongChong");

    StringTokenizer st;
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      String first = st.nextToken();
      String second = st.nextToken();

      // 만약 둘 중 한 명이라도 춤을 추고 있다면, 함께 들어온 사람도 춤을 추게 됨
      if (set.contains(first) || set.contains(second)) {
        // 둘 다 추가해도 상관 없음 (중복 허용하지 않으므로)
        set.add(first);
        set.add(second);
      }
    }

    System.out.println(set.size());
  }
}