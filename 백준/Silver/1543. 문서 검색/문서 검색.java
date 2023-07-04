import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String text = br.readLine();
    String str = br.readLine();

    text = text.replaceAll(str, "1");
    int answer = 0;
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      if (c == '1')
        answer++;
    }

    System.out.println(answer);
  }
}