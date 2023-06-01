import java.util.*;

class Solution
{
    public int solution(String s)
    {

        // 짝지어 있다 -> stack 이용하면 될 것 같다
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            char c = arr[i];
            
            // stack 비어있으면 바로 넣어주자
            if(st.isEmpty())
                st.push(c);
            else {
                // 현재 문자 c와 stack.peek()로 확인한 맨 위 값이 같으면 
                // stack.pop()으로 빼주자.
                if(c == st.peek())
                    st.pop();
                // 값이 다르면 push해주자.
                else st.push(c);
            }
        }
        
        // stack이 비어있으면 모두 짝지어 있으므로 1 반환
        return st.isEmpty() ? 1 : 0;
    }
}