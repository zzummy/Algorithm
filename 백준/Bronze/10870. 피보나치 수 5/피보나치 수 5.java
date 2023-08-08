import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    System.out.println(fivo(N));
  }

  public static int fivo(int n) {
    if (n == 0)
      return 0;
    if (n == 1)
      return 1;

    return fivo(n - 1) + fivo(n - 2);
  }
}