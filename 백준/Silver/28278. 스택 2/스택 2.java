import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());

    Stack<String> stack = new Stack<>();

    while (N-- > 0) {
      String[] input = br.readLine().split(" ");

      switch (input[0]) {
        case "1":
          stack.push(input[1]);
          break;
        case "2":
          sb.append(!stack.isEmpty() ? stack.pop() : "-1").append("\n");
          break;
        case "3":
          sb.append(!stack.isEmpty() ? stack.size() : 0).append("\n");
          break;
        case "4":
          sb.append(stack.isEmpty() ? "1" : "0").append("\n");
          break;
        case "5":
          sb.append(!stack.isEmpty() ? stack.peek() : "-1").append("\n");
          break;
      }
    }

    br.close();

    System.out.println(sb.toString());
  }
}