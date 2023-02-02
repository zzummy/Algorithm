class Solution {
    public int solution(int num, int k) {
        String strNum = Integer.toString(num);
        String strK = Integer.toString(k);
        
        if(strNum.indexOf(strK) != -1) return strNum.indexOf(strK) + 1;
        else return -1;
    }
}