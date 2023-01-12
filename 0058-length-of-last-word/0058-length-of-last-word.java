class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
         s=s.trim();                         //trim the string

        int start=s.length()-1;

        for(int i=start;i>=0;i--){
             if(s.charAt(i) == ' ') {           //[] are not used here
                break;
         }
        count++;
    }

      return count;   
    }
}