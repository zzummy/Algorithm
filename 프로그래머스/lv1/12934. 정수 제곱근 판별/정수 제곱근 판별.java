class Solution {
    public long solution(long n) {
        long x = 0;
        while(x*x <= n){
            if(++x*x == n) return (x+1)*(x+1);
        }
        return -1;
    }
}