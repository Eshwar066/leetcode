class Solution {

    public int lengthOfLongestSubstring(String s) {        
        int a = 0, b = 0; 
        int max = 0; 
        int l = s.length(); 

       
        while (b < l) {
          
            for (int i = a; i < b; i++) {
                if (s.charAt(i) == s.charAt(b)) {
                    a = i + 1;
                    break;
                }
            }

            
            max = Math.max(max, b - a + 1);

            b++; 
        }

        return max;
    }
    
    // public int lengthOfLongestSubstring(String s) {         //two pointer approach
    //     int a_pointer=0,b_pointer=0,max=0;

    //     HashSet<Character> hashSet=new HashSet<>();           //using hashset
    //     while(b_pointer<s.length()){
    //         if(!hashSet.contains(s.charAt(b_pointer))){
    //             hashSet.add(s.charAt(b_pointer));
    //             b_pointer++;
    //             max=Math.max(hashSet.size(),max);
    //         }else{
    //             hashSet.remove(s.charAt(a_pointer));
    //             a_pointer++;
    //         }
    //     }
    //     return max; 
    // }
}