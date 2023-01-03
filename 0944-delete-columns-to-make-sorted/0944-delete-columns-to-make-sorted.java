class Solution {
    public int minDeletionSize(String[] strs) {
        int result=0;
        for (int c=0;c<strs[0].length();c++){
            for(int r=0;r<strs.length-1;r++){
                if(strs[r].charAt(c)>strs[r+1].charAt(c)){
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}