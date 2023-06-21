import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] arr1 = br.readLine().toCharArray();
    char[] arr2 = br.readLine().toCharArray();

    int[] alpha = new int[26];
    for (char c : arr1)
      alpha[c - 97]++;
    for (char c : arr2)
      alpha[c - 97]--;

    int sum = 0;
    for (int i = 0; i < alpha.length; i++) {
      alpha[i] = Math.abs(alpha[i]);

      if (alpha[i] != 0)
        sum += alpha[i];
    }

    System.out.println(sum);
  }
}