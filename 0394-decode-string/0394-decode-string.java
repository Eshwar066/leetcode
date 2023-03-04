class Solution {                                                     //Nick White
    public String decodeString(String s) {
        Stack<Integer> counts=new Stack();
        Stack<String> result=new Stack();
        String res="";
        int i=0;
        
        
        
        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))){
                int count=0;
                if(s.length()<2) return "";
                while (Character.isDigit(s.charAt(i))){
                    count=10*count+(s.charAt(i)-'0');
                    i +=1;
               }
                counts.push(count);
            }else if(s.charAt(i)=='['){
                result.push(res);
                res="";
                i+=1;
            }else if(s.charAt(i)==']'){
                StringBuilder temp=new StringBuilder(result.pop());
                int count=counts.pop();
                for(int k=0; k<count;k++){
                    temp.append(res);
                }
                res=temp.toString();
                i+=1;
            }else{
                res += s.charAt(i);
                i+=1;
            }
            
        }
         return res;             
    }
}