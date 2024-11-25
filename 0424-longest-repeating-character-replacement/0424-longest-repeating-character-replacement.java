class Solution {
    // public int characterReplacement(String s, int k) {
    //     int length=0;
    //     int j=-1;
    //     int count=0;
    //     for(int i=0;i<s.length();i++){
    //         if(s.charAt(i)=='A') count++;
    //         while(count>k){
    //             j++;
    //             if(s.charAt(j)=='A') count--;
    //         }
    //         int tl=i-j;
    //         length=Math.max(length,tl);
    //     }
    //     return length;
    // }
  public int characterReplacement(String s, int k) {
   int[] arr = new int[26];
        int res = 0;
        int max = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            arr[s.charAt(r) - 'A']++;
            max = Math.max(max, arr[s.charAt(r) - 'A']);

            if (r - l + 1 - max > k) { 
           
                arr[s.charAt(l) - 'A']--;
                l++;
            }

           
            res = Math.max(res, r - l + 1);
        }

        return res;
}
}