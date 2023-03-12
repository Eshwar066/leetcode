class Solution {                                            //Algo made easy
    public List<String> letterCasePermutation(String s) {
        LinkedList<String> result=new LinkedList<>();
        result.add(s);
        int n=s.length();
        
        for(int i=n-1;i>=0;i--){
            char c=s.charAt(i);
            if(Character.isLetter(c)){
                int size=result.size();
                while(size >0){
                    String str=result.poll();
                    String left=str.substring(0,i);
                    String right=str.substring(i+1,n);
                    result.add(left+Character.toLowerCase(c)+right);
                    result.add(left+Character.toUpperCase(c)+right);
                    size--;
                }
            }
        }
        return result;
    }
}