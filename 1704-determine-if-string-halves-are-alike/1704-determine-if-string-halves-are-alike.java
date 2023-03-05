class Solution {                                    //Algo made easy
    public boolean halvesAreAlike(String s) {
        char ch[]=s.toCharArray();
        int left=0,right=ch.length-1;
        
        int lCount=0,rCount=0;
        Set vowels=Set.of('a','e','i','o','u','A','E','I','O','U');
        while(left<right){
            lCount+= vowels.contains(ch[left])?1:0;
            rCount+= vowels.contains(ch[right])?1:0;
            left++;
            right--;
        }
        return lCount==rCount;
    }
}