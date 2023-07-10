import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/*
 * 20920. 영단어 암기는 괴로워
 */

public class Main {
  static class Word {
    String word;
    int cnt;

    public Word(String word, int cnt) {
      this.word = word;
      this.cnt = cnt;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    HashMap<String, Integer> map = new HashMap<>();

    for (int i = 0; i < N; i++) {
      String word = br.readLine();

      if (word.length() >= M) {
        map.put(word, map.getOrDefault(word, 0) + 1);
      }
    }

    // Map에 들어간 value 기준으로 정렬
    // Map은 데이터의 순서가 없으므로, List를 이용하여 정렬하자
    List<Word> list = new ArrayList<>();
    for (String key : map.keySet()) {
      list.add(new Word(key, map.get(key)));
    }

    // 1) cnt가 큰 것
    // 2) word의 길이가 긴 것
    // 3) 알파벳 순
    Collections.sort(list, (w1, w2) -> {
      if (w1.cnt == w2.cnt) {
        if (w1.word.length() == w2.word.length()) {
          // 3)
          return w1.word.compareTo(w2.word);
        } else {
          // 2)
          return w2.word.length() - w1.word.length();
        }
      } else {
        // 1)
        return w2.cnt - w1.cnt;
      }
    });

    for (int i = 0; i < list.size(); i++)
      bw.write(list.get(i).word + "\n");

    bw.flush();
  }
}