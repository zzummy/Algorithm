import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    int[] arr = new int[N];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int answer = Integer.MAX_VALUE;
    int ryan = 0;
    int s = 0, e = 0;

    while (e < N) {
      if (ryan < K) {
        if (arr[e] == 1) {
          ryan++;
        }
        e++;
      } else {
        // s++ 해줄 차례
        // 하지만 빼줄 arr[s]가 ryan(=1)이라면 ryan--를 처리해줘야 함
        if (arr[s] == 1) {
          answer = Math.min(answer, e - s);
          ryan--;
        }
        s++;
      }
    }

    // e가 배열의 맨 끝에 도착해도 s는 더 움직일 수 있음
    while (s < N) {
      if (ryan < K)
        break;

      if (arr[s] == 1) {
        answer = Math.min(answer, e - s);
        ryan--;
      }
      s++;
    }

    System.out.println(answer == Integer.MAX_VALUE ? -1 : answer);
  }
}