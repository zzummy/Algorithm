import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    Stack<Character> stack = new Stack<>();
    // Stack<Character> rigth = new Stack<>();
    String bomb = br.readLine();
    int bombLen = bomb.length();

    for (int i = 0; i < input.length(); i++) {
      stack.push(input.charAt(i));

      // 폭발 문자열(길이 1~36)이 input 길이와 같아지면 폭발 문자열이 있는지 탐색
      if (bomb.length() <= stack.size()) {
        boolean flag = true;

        // stack.get()을 사용해 stack의 index에 해당하는 값을 출력
        // stack.size() - bomb.length() 부터 stack.size()까지를 탐색해 폭발 문자열과 같으면
        // false -> pop()으로 꺼내 제거
        for (int j = 0; j < bombLen; j++) {
          if (stack.get(stack.size() - bombLen + j) != bomb.charAt(j)) {
            flag = false;
            break;
          }
        }

        if (flag) {
          for (int j = 0; j < bombLen; j++) {
            stack.pop();
          }
        }
      }

    }

    StringBuilder sb = new StringBuilder();
    for (Character c : stack)
      sb.append(c);
    System.out.println(sb.length() > 0 ? sb.toString() : "FRULA");
  }
}