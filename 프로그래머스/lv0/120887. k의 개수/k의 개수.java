class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int x = i; x <= j; x++){
            String[] arr = Integer.toString(x).split("");
            for(int n = 0; n < arr.length; n++){
                if(arr[n].equals(k+"")) answer++;
            }
        }
        return answer;
    }
}