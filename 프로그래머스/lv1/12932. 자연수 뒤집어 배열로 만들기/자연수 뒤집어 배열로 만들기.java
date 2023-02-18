import java.util.*;

class Solution {
    public ArrayList<Integer> solution(long n) {
        ArrayList<Integer> list = new ArrayList<>();
        while(n>0){
            int num = (int)(n % 10);
            list.add(num);
            n /= 10;
        }
        return list;
    }
}