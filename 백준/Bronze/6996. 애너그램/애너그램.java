import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for (int i = 0; i < N; i++) {
      String firstStr = sc.next();
      String secondStr = sc.next();
      isAnagram(firstStr, secondStr);
    }
    sc.close();
  }

  public static void isAnagram(String str1, String str2) {
    char[] cArr1 = str1.toCharArray();
    char[] cArr2 = str2.toCharArray();

    Arrays.sort(cArr1);
    Arrays.sort(cArr2);

    // System.out.println(cArr1);

    if(Arrays.equals(cArr1, cArr2))
      System.out.println(str1 + " & " + str2 + " are anagrams.");
    else System.out.println(str1 + " & " + str2 + " are NOT anagrams.");
  }
}