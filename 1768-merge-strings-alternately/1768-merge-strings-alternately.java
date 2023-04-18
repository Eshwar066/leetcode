class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res="";
      //  int n=Math.max(word1.length(),word2.length());
        int i=0,j=0;
        while(i<word1.length() || j<word2.length()){
            if(i<word1.length() && j<word2.length()){
            res+=word1.charAt(i);
            res+=word2.charAt(j);
            i++;
            j++;
            }else if(i<word1.length()){
                res+=word1.charAt(i);
                i++;
            }else{
                 res+=word2.charAt(j);
                j++;
            }
        }
        return res;
    }
}