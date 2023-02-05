import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	static int N;
	static int[][] map;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	static int[] count;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N][N];
		count = new int[N*N];		// 최악의 경우의 수를 

		for (int i = 0; i < N; i++) {
			char[] c = sc.next().toCharArray();
			for (int j = 0; j < N; j++) {
				map[i][j] = c[j] - '0';
			}
		}

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j]==1) {
					cnt++;
					count[cnt+1]=1;
					dfs(i, j, cnt+1);		// 2그룹부터
				}
			}
		}
		
		//print();
		System.out.println(cnt);
		Integer[] ii = new Integer[cnt];

		for (int i = 0; i < cnt; i++) {
			ii[i] = count[i+2];
		}
		
		Arrays.sort(ii);
		//desc
		//Arrays.sort(ii, Comparator.reverseOrder());	
		
		for( int i : ii) {
			System.out.println(i);
		}
		
	}

	/*public static void print() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}*/

	public static void dfs(int r, int c, int group) {
		map[r][c] =group;
		for (int d = 0; d < 4; d++) {		// 사방탐색
			int nr = r + dr[d];
			int nc = c + dc[d];
			if(!check(nr,nc)) continue;
			if(map[nr][nc] == 1)	{	// map[nr][nc] == 1 (갈 수 있고, 간 적이 없는)
				count[group]++;
				dfs(nr, nc, group);
			}
		}
	}

	public static boolean check(int r, int c) {
		return r>=0 && r<N && c>=0 && c<N;
	}
}