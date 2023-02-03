class Solution {
    public int solution(int n) {
        Double sqrt = Math.sqrt(n);
        return (sqrt == sqrt.intValue()) ? 1 : 2;
    }
}