class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        
        for(String s : keyinput){
            switch(s){
                case "up":
                    y = Math.abs(y + 1) <= board[1] / 2? y + 1 : y;
                    break;
                case "down":
                    y = Math.abs(y - 1) <= board[1] / 2? y - 1 : y;
                    break;
                case "left":
                    x = Math.abs(x - 1) <= board[0] / 2 ? x - 1 : x;
                    break;
                case "right":
                    x = Math.abs(x + 1) <= board[0] / 2 ? x + 1 : x;
                    break;
            }
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}