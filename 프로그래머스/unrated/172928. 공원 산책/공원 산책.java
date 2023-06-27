class Solution {
    public int[] solution(String[] park, String[] routes) {
        char[][] arr = new char[park.length][park[0].length()];
        
        int x =0, y = 0;   // 시작 S의 위치
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = park[i].charAt(j);
                
                if(park[i].charAt(j) == 'S'){
                    x = j;
                    y = i;
                }
            }
        }
        
        for(String route : routes){
            String direction = route.split(" ")[0];
            int len = Integer.parseInt(route.split(" ")[1]);
            
            int nx = x;
            int ny = y;
            for(int i=0; i<len; i++){
                if(direction.equals("N")){
                    ny--;
                }else if(direction.equals("S")){
                    ny++;
                }else if(direction.equals("W")){
                    nx--;
                }else if(direction.equals("E")){
                    nx++;
                }
                
                if(nx >=0 && nx < arr[0].length && ny >= 0 && ny < arr.length){
                    if(arr[ny][nx] == 'X')
                        break;
                    if(i == len-1) {
                        x = nx;
                        y = ny;
                    }
                }
            }
        }
        
        int[] answer = {y, x};
        return answer;
    }

}