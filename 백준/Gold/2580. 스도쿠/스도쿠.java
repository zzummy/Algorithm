import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int[][] map = new int[9][9];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < 9; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 9; j++) {
        map[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    sudoku(0, 0);
  }

  public static void sudoku(int row, int col) {
    // 해당 행이 다 채워졌으므로, 다음 행으로 이동
    if (col == 9) {
      sudoku(row + 1, 0); // 첫번째 col로 초기화
      return;
    }

    // 행과 열 모두 채웠음
    if (row == 9) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
          sb.append(map[i][j]).append(" ");
        }
        sb.append("\n");
      }

      System.out.println(sb);
      System.exit(0);
    }

    // map[row][col]==0이면, 1~9까지 가능한 수 탐색
    if (map[row][col] == 0) {
      for (int i = 1; i < 10; i++) {
        if (check(row, col, i)) {
          map[row][col] = i;
          sudoku(row, col + 1); // 행부터 쭉쭉 +1
        }
      }

      // 잘못된 값을 집어넣었을 경우 재귀에서 돌아왔을 때, 다시 초기화해주기 위함
      map[row][col] = 0;
      return;
    }

    sudoku(row, col + 1);
  }

  public static boolean check(int row, int col, int value) {
    // 행 확인 (col 0 ~ 9 확인)
    for (int i = 0; i < 9; i++) {
      // value와 겹치는지 확인
      if (map[row][i] == value) {
        return false;
      }
    }

    // 열 확인 (x 0 ~ 9)
    for (int i = 0; i < 9; i++) {
      if (map[i][col] == value) {
        return false;
      }
    }

    // 3*3 칸 안에서 중복되는지 확인
    int row_num = (row / 3) * 3;
    int col_num = (col / 3) * 3;

    for (int i = row_num; i < row_num + 3; i++) {
      for (int j = col_num; j < col_num + 3; j++) {
        if (map[i][j] == value)
          return false;
      }
    }

    return true;
  }
}