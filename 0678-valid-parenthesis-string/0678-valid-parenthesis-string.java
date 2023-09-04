class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> sb=new Stack<>();
        Stack<Integer> ss=new Stack<>();
        
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                sb.push(i);
            }else if(ch=='*'){
                ss.push(i);
            }else{
                if(sb.isEmpty() && ss.isEmpty()) return false;
                if(!sb.isEmpty()){
                    sb.pop();
                }else{
                    ss.pop();
                }
            }
        }
        while(!sb.isEmpty() && !ss.isEmpty()){
            if(sb.pop() > ss.pop())
                return false;
        }
        
        return sb.isEmpty(); 
        
        
    }
}