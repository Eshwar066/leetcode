class Solution {
    public int[] diStringMatch(String s) {
        int size=s.length();
        int low=0;
        int high=size;
        
        int[] res=new int[size+1];
        
        for(int i=0;i<size;i++){
            if(s.charAt(i) == 'I'){
                res[i]=low;
                low++;
            }else{
                res[i]=high;
                high--;
            }
        }
        res[size]=low;
        return res;
    }
}