class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int longer = Math.max(sides[0], sides[1]);
        int shorter = Math.min(sides[0], sides[1]);
        
        int max = longer + shorter - 1;
        int min = longer - shorter + 1;
        return max - min + 1;
    }
}