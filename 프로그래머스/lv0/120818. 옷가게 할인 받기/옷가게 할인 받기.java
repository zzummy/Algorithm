class Solution {
    public int solution(int price) {       
        if(price >= 500000)
            price *= 0.8;
        else if(price >=300000)
            price *= 0.90;
        else if(price >= 100000)
            price *= 0.95;
        
        return price;
    }
}