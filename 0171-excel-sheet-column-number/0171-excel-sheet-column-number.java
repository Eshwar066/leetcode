class Solution {                                //knowledge center
    public int titleToNumber(String columnTitle) {
        int result=0;
        for(char c:columnTitle.toCharArray()){
            int d=c-'A'+1;
            result=result*26+d;
        }
        return result;
    }
}