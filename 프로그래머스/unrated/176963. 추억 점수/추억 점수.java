import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        int idx = 0;
        for(int i=0; i<photo.length; i++){
            int sum = 0;
            for(int j=0; j<photo[i].length; j++){
                String str = photo[i][j];
                // System.out.println(map.get(str));
                if(map.get(str) != null)
                    sum += map.get(str);
            }
            answer[idx++] = sum;
        }
        return answer;
    }
}