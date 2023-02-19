class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int a = n > m ? n : m;
        int b = n > m ? m : n;
        
        // 최대공약수
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        
        answer[0] = a;
        
        // 최소공배수 * 최대공약수 = a * b
        answer[1] = n * m / a;
        
        return answer;
    }
}