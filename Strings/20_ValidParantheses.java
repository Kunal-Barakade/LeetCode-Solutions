class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>() ;

        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i) ;
            if(ch == '{' || ch == '(' || ch == '[')
            {
                stack.push(ch) ;
                continue ;
            }

            if(stack.isEmpty()) return false ;
            char sEle = stack.peek() ;
            if(sEle == '{' && ch == '}') stack.pop();
            else if(sEle == '(' && ch == ')') stack.pop();
            else if(sEle == '[' && ch == ']') stack.pop();
            else return false ;
        }
        return stack.isEmpty() ;

        
    }
}