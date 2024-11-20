class Solution {
    int answer = 0;
    
    public void DFS(int depth, int sum, int[] numbers, int target){
        if(depth == numbers.length){
            if(sum == target)
                answer++;
            return;
        }else{
            DFS(depth + 1, sum + numbers[depth], numbers, target);
            DFS(depth + 1, sum - numbers[depth], numbers, target);
        }
    }
    
    public int solution(int[] numbers, int target) {
        DFS(0, 0, numbers, target);
        return answer;
    }
}