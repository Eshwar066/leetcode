class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)return false;
        
        Stack<Character> stack=new Stack();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }else if(c==')' && !stack.isEmpty()){
                if(stack.peek()=='('){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(c=='}' && !stack.isEmpty()){
                if( stack.peek()=='{'){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(c==']' && !stack.isEmpty()){
                if( stack.peek()=='['){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                return false;
            }
                
           
        }
        // if(stack.size()==0) return true;
        // return false;
        return stack.isEmpty();
    }
}