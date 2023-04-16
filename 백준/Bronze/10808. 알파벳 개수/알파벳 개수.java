import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    int[] arr = new int[26];
    for (int i = 0; i < input.length(); i++) {
      int idx = input.charAt(i) - 97;
      // System.out.println(idx);
      arr[idx]++;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}