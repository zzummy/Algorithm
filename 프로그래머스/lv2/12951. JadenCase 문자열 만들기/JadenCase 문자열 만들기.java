class Solution {
    public String solution(String s) {
        String answer = "";
        // 대문자로 바꾸기 위해 공백으로 나눔 
        String[] arr = s.split(" ");
        for(int i=0; i<arr.length; i++){
            String str = arr[i];
            
            // 공백이 나오면 그냥 answer에 추가
            if(str.length() == 0){
                answer += " ";
            }else{
                // 첫 문자를 대문자로, 나머지는 소문자로
                answer += str.substring(0,1).toUpperCase();
                answer += str.substring(1,str.length()).toLowerCase();
                answer += " ";
            }
        }
        
        // 입력받은 문자열의 마지막이 공백이면 바로 return answer 해주기
        // 위의 for문 마지막에 공백이 더해졌으므로
        if(s.substring(s.length() -1, s.length()).equals(" "))
            return answer;
        
        // 맨 마지막에 더해진 공백 삭제해주자
        return answer.substring(0, answer.length() -1);
    }
}