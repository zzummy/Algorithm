import java.util.*;

class Solution {
    public Integer[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                int n = numbers[i] + numbers[j];
                if(list.indexOf(n) < 0) list.add(n);
            }
        }
        Collections.sort(list);
        return list.toArray(new Integer[0]);
    }
}