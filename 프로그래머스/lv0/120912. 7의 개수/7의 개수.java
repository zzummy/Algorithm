class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i < array.length; i++){
            String[] arr = Integer.toString(array[i]).split("");
            for(int j = 0; j < arr.length; j++){
                if(arr[j].equals("7")) answer++;
            }
        }
        return answer;
    }
}