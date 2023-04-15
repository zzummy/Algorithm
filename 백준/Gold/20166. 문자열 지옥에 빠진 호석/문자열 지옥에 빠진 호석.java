import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
 * 20166. 문자열 지옥에 빠진 호석
 */

class Point {
  int x, y, len;
  String str;

  public Point(int x, int y, int len, String str) {
    this.x = x;
    this.y = y;
    this.len = len;
    this.str = str;
  }
}

public class Main {
  static int N, M, K;
  static int[] dx = { 0, 1, 1, 1, 0, -1, -1, -1 };
  static int[] dy = { 1, 1, 0, -1, -1, -1, 0, 1 };
  static String[][] arr;
  static HashMap<String, Integer> map;
  static int maxLen = Integer.MIN_VALUE;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(st.nextToken());
    map = new HashMap<>();
    arr = new String[N][M];

    for (int i = 0; i < N; i++) {
      String input = br.readLine();
      for (int j = 0; j < M; j++) {
        arr[i][j] = input.charAt(j) + "";
      }
    }

    String[] likes = new String[K]; // 신이 좋아하는 문자열 담아둘 배열 : 최종 출력에 사용하기 위함

    for (int k = 0; k < K; k++) {
      String like = br.readLine(); // 신이 좋아하는 문자열
      likes[k] = like;
      maxLen = Math.max(maxLen, like.length());
      map.put(like, 0);
    }

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        makeString(i, j);
      }
    }

    StringBuilder sb = new StringBuilder();
    for (String s : likes)
      sb.append(map.get(s)).append('\n');

    System.out.println(sb.toString());

  }

  // 문자열 만들 함수
  public static void makeString(int x, int y) {
    Queue<Point> q = new LinkedList<>();
    q.offer(new Point(x, y, 1, arr[x][y]));

    while (!q.isEmpty()) {
      Point tmp = q.poll();

      // 신이 좋아하는 문자열보다 길 경우, 탐색 중지
      if (tmp.len > maxLen)
        continue;

      // 일치하면 카운트
      if (map.containsKey(tmp.str)) {
        map.put(tmp.str, map.get(tmp.str) + 1);
      }

      // 탐색
      for (int d = 0; d < 8; d++) {
        int nx = tmp.x + dx[d];
        int ny = tmp.y + dy[d];

        if (nx < 0)
          nx = N - 1;
        else if (nx >= N) {
          nx = 0;
        }

        if (ny < 0)
          ny = M - 1;
        else if (ny >= M) {
          ny = 0;
        }

        q.offer(new Point(nx, ny, tmp.len + 1, tmp.str + arr[nx][ny]));
      }
    }
  }
}