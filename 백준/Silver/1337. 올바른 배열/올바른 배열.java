import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      list.add(Integer.parseInt(br.readLine()));
    }

    // 오름차순 정렬
    Collections.sort(list);

    // 1 ~ 4까지 list.get(s)값에 더해서 list에 있는지 확인
    // => 연속적인 올바른 배열 만들기 위한 경우의 수 찾기 위함
    int[] arr = new int[N];
    for (int s = 0; s < N; s++) {
      for (int e = 1; e < 5; e++) {
        if (!list.contains(list.get(s) + e))
          arr[s]++;
      }
    }

    // 정렬 후, 0번째 값 출력 (최솟값)
    Arrays.sort(arr);
    System.out.println(arr[0]);
  }
}