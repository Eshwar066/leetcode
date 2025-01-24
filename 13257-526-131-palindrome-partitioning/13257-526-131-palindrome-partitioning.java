class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        partitionFn(0,s,res,new ArrayList<>());
        return res;
    }
    public void partitionFn(int index,String s,  List<List<String>> res,List<String> ds){
        if(index==s.length()){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<s.length();++i){
            if(isPalindrome(s,index,i)){
                ds.add(s.substring(index,i+1));
                partitionFn(i+1,s,res,ds);
                ds.remove(ds.size()-1);
            }
        }

    }
    public boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }   
        }
         return true;
    }
}