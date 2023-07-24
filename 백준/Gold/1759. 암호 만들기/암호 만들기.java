import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  static int L, C;
  static String[] arr;
  static String[] pwd;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    L = Integer.parseInt(st.nextToken());
    C = Integer.parseInt(st.nextToken());

    arr = new String[C];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < C; i++)
      arr[i] = st.nextToken();

    // 알파벳 순으로 출력이므로 미리 정렬
    Arrays.sort(arr);

    pwd = new String[L];

    // 조합
    combi(0, 0);
  }

  public static void combi(int cnt, int start) {
    if (cnt == L) {
      // 최소 1개의 모음 + 최소 2개의 자음인지 확인
      if (check(pwd)) {
        for (String str : pwd)
          System.out.print(str);
        System.out.println();
      }
      return;
    }

    for (int i = start; i < C; i++) {
      pwd[cnt] = arr[i];
      combi(cnt + 1, i + 1);
    }
  }

  public static boolean check(String[] pwd) {
    // j : 자음의 개수, m : 모음의 개수
    int j = 0;
    int m = 0;

    for (int i = 0; i < pwd.length; i++) {
      // 모음 a e i o u
      if (pwd[i].equals("a") || pwd[i].equals("e") || pwd[i].equals("i") || pwd[i].equals("o") || pwd[i].equals("u"))
        m++;
      else
        j++;
    }

    if (j >= 2 && m >= 1)
      return true;
    else
      return false;
  }
}