class Solution {
    public String solution(String s) {
        String[] arr = new String[s.length()];
        arr = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            int a = Integer.parseInt(arr[i]);
            min = Math.min(a,min);
            max = Math.max(a,max);
        }
        
        return "" + min + " " + max;
    }
}