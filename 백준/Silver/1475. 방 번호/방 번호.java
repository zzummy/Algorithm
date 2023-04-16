import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    int[] arr = new int[10];

    for (int i = 0; i < input.length(); i++) {
      int num = Character.getNumericValue(input.charAt(i));
      // 6과 9는 같은 수로 보자
      if (num == 6)
        arr[9]++;
      else
        arr[num]++;
    }

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < 9; i++) {
      max = Math.max(max, arr[i]);
    }

    // 9가 홀수면
    int nine = arr[9] % 2 == 0 ? arr[9] / 2 : arr[9] / 2 + 1;

    max = Math.max(max, nine);
    System.out.println(max);
  }
}