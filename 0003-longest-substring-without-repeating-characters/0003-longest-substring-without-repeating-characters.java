class Solution {
    public int lengthOfLongestSubstring(String s) {         //two pointer approach
        int a_pointer=0,b_pointer=0,max=0;

        HashSet<Character> hashSet=new HashSet();           //using hashset
        while(b_pointer<s.length()){
            if(!hashSet.contains(s.charAt(b_pointer))){
                hashSet.add(s.charAt(b_pointer));
                b_pointer++;
                max=Math.max(hashSet.size(),max);
            }else{
                hashSet.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max; 
    }
}