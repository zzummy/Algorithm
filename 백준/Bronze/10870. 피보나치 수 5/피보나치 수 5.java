import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		System.out.println(pivo(n));
	}

	public static int pivo(int n) {
		if(n == 1) return 1;
		if(n == 0) return 0;
		return pivo(n-1) + pivo(n-2);
	}

}