import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 대소문자 {
  public static void main(String[] args) throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    String answer = "";

    for (char c : str.toCharArray()) {
      if (Character.isLowerCase(c))
        answer += Character.toUpperCase(c);
      else
        answer += Character.toLowerCase(c);
    }
    
    System.out.println(answer);
  }
  
}
