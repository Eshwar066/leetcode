class Solution {
    public boolean isIsomorphic(String s, String t) {
        Integer[] c1 = new Integer[256],
              c2 = new Integer[256];
        for(int i = 0; i < s.length(); i++){
            char w1 = s.charAt(i),
                 w2 = t.charAt(i);
            if(c1[w1] == null){
                c1[w1]=i;
            }
            if(c2[w2] == null){
                c2[w2]=i;
            }
            if(c1[w1] != c2[w2]){
                return false;
            }
        }
        return true;
    }
}