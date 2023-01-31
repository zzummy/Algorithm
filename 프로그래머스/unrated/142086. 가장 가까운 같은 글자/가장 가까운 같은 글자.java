class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] arr = s.toCharArray();
        
        answer[0] = -1;
        for(int i = 1; i < arr.length; i++){
            for(int j = i-1; j >= 0; j--){
                if(arr[i] == arr[j]) {
                    answer[i] = i-j;
                    break;
                }else answer[i] = -1;
            }
        }
        return answer;
    }
}