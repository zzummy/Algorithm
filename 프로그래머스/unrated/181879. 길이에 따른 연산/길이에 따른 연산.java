class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
        boolean flag = false;
        if(num_list.length > 10) flag = true;
        
        for(int i=0; i<num_list.length; i++){
            if(flag) sum += num_list[i];
            else mul *= num_list[i];
        }
        
        return flag ? sum : mul;
    }
    
}