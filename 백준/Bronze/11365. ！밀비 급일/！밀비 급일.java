import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while (true) {
      String str = br.readLine();
      if (str.equals("END"))
        break;

      StringBuilder reverse = new StringBuilder(str);
      reverse = reverse.reverse();
      sb.append(reverse + "\n");
    }
    System.out.println(sb);
  }
}