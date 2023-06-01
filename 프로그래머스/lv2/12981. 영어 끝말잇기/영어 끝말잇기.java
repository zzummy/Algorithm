import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        // 탈락자가 없을 경우 [0, 0] 반환이므로 초기화
        int[] answer = {0, 0};

        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<words.length; i++){
            // 첫번째 단어가 아닐 때
            if(i != 0){
                String now = words[i];
                String back = words[i-1];
                
                char nowC = now.charAt(0);
                char backC = back.charAt(back.length() -1);
                
                // map에 str 단어가 존재하거나, 
                // 이전 단어의 맨 마지막 문자와 현재 단어의 시작 문자가 다를 경우
                // answer[번호, 차례] 반환
                if(map.containsKey(now) || nowC != backC){
                    answer[0] = i % n + 1;
                    answer[1] = i / n + 1;
                    
                    return answer;
                }
            }
            
            // 조건 모두 성립해서 끝말잇기 이어가기 위해 push
            map.put(words[i], 1);
        }

        return answer;
    }
}