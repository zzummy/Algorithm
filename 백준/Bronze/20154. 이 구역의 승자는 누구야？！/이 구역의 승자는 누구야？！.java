import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] alphabet = { 3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1 };
    
    String input = br.readLine();
    int[] arr = new int[input.length()];
    
    for (int i = 0; i < arr.length; i++) {
      // A이면 A - A = 0 이니까 3이 들어감
      arr[i] = alphabet[input.charAt(i) - 'A'];
    }

    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      sum %= 10;
    }

    if (sum % 2 == 0)
      System.out.println("You're the winner?");
    else
      System.out.println("I'm a winner!");
    
  }
}