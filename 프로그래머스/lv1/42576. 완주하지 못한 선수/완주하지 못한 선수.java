import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // 참가자와 완주자 오름차순 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        // equals로 비교시 다를 경우가 딱 한명의 미완주자이므로 return
        for(int i = 0; i < completion.length; i++){
            if(participant[i].equals(completion[i])) continue;
            else return participant[i];
        }
        
        // 미완주자가 제일 마지막에 정렬된 참가자일 경우
        return participant[participant.length-1];
    }
}