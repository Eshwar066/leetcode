class Solution {                          //Nick white
    public boolean isPalindrome(String s) {
        String fixed_string="";
        
        for(char c:s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                fixed_string+=c;
            }
        }
        fixed_string=fixed_string.toLowerCase();
        
        int l=0, r=fixed_string.length()-1;
        while(l<=r){
            if(fixed_string.charAt(l)!=fixed_string.charAt(r)){
             return false;
            }
            l++;
            r--;
        }
        return true;
    }
}