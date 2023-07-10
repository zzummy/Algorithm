import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long S = sc.nextLong();
    long sum = 0;

    if (S == 1 || S == 2) {
      System.out.println(1);
      return;
    }

    for (int i = 0; i < S; i++) {
      sum += i;
      if (sum > S) {
        System.out.println(i - 1);
        return;
      } else if (sum == S) {
        System.out.println(i);
        break;
      }
    }

    sc.close();
  }
}