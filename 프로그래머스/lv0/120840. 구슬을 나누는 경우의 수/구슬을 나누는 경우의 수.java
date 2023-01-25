class Solution {
    public int solution(int balls, int share) {
        return combination(balls, share);
    }
    
    // 서로 다른 n개 중 r개 순서 없이 뽑는 경우 = 조합
    public static int combination(int n, int r){
        if(r == 0 || n == r) return 1;
        else return combination(n-1, r-1) + combination(n-1, r);
    }
}