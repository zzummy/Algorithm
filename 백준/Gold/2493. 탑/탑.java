import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		Stack<int[] > stack = new Stack<>();
		
		for (int i = 1; i <= N ; i++) {
			int num = Integer.parseInt(st.nextToken());

			while(!stack.isEmpty()) {
				if(stack.peek()[1] > num) {
					System.out.print(stack.peek()[0] +" ");
					break;
				}else if(stack.peek()[1] < num)
					stack.pop();
			}
			if(stack.isEmpty()) {
				System.out.print(0 + " ");
			}
			stack.push(new int[] {i,num});
		}
	}
}