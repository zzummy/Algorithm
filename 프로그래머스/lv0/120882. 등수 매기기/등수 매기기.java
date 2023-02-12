import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        ArrayList<Integer> avg = new ArrayList<>();
        for(int[] s : score){
            avg.add(s[0] + s[1]);
        }
        // 높은 점수 순으로 내림차순 정렬
        avg.sort(Comparator.reverseOrder());
        
        int[] rank = new int[score.length];
        for(int i = 0; i < rank.length; i++){
            rank[i] = avg.indexOf(score[i][0] + score[i][1]) + 1;
        }
        
        return rank;
    }
}