class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        
        int[] arr = new int[numlist.length];
        int idx = 0;
        for(int k : numlist){
            if(k % n == 0) {
                arr[idx] = k;
                idx++;
            }
        }
        
        answer = new int[idx];
        for(int i = 0 ; i < idx; i++)
            answer[i] = arr[i];
        
        return answer;
    }
}