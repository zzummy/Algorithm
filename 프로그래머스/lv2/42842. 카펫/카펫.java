class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        
        // 조건
        // 1) 가로 >= 세로
        // 2) 가로, 세로 둘 다 3 이상 (yellow가 가운데에 위치해야하므로)
        for(int w = 3; w < total; w++){
            // 위 조건을 해당하는 total의 약수 -> 가로 w, 세로 h 값
            int h = total / w;
            
            if(w >= h && total % w == 0 && h >= 3){
                // 가운데 노란색 카펫의 개수
                int yc = (w - 2) * (h - 2);
                
                if(yc == yellow){
                    answer[0] = w;
                    answer[1] = h;
                    return answer;
                }
            }
        }
        
        return answer;
    }
}