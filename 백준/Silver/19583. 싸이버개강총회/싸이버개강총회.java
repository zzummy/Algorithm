import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] TIME = br.readLine().split(" ");

    String S = TIME[0];
    String E = TIME[1];
    String Q = TIME[2];

    // 개강총회 전에 참여한 명단
    HashSet<String> before = new HashSet<>();
    // 개강총회 끝나고 퇴장한 명단
    HashSet<String> end = new HashSet<>();

    String input = br.readLine();
    while (input != null && !input.isEmpty()) {
      String[] arr = input.split(" ");
      String time = arr[0];
      String name = arr[1];

      if (S.compareTo(time) >= 0) {
        before.add(name);
      } else if (E.compareTo(time) <= 0 && Q.compareTo(time) >= 0) {
        end.add(name);
      }

      input = br.readLine();
    }

    int answer = 0;
    for (String name : before) {
      if (end.contains(name))
        answer++;
    }
    System.out.println(answer);
  }
}