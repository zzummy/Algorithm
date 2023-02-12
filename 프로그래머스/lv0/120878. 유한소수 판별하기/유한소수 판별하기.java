class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int min = Math.min(a,b);
        int gcd = 0;
        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b % i == 0)
                gcd = i;
        }
        // System.out.println(gcd);
        int bunsu = b / gcd;
        while(bunsu > 1){
            if(bunsu % 2 ==0)
                bunsu /= 2;
            else if(bunsu % 5 == 0)
                bunsu /= 5;
            else return 2;
        }
        
        return 1;
    }
}