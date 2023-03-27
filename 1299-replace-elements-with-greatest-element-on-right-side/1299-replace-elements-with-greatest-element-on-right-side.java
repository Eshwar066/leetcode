// class Solution {
//     public int[] replaceElements(int[] arr) {
   
//          int max = -1;

//         for (int i = arr.length - 1; i >= 0; i--) {
//             int temp = arr[i];
//             arr[i] = max;
//             max = Math.max(temp, max);
//         }

//         return arr;
        
//     }
// }

class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];

        for (int i = 0; i < ans.length - 1; i++) {
		
            int max = Integer.MIN_VALUE;
            for (int j = i + 1; j < ans.length; j++) {
                max = Math.max(max, arr[j]);
            }
			
            ans[i] = max;
        }
		
        ans[arr.length - 1] = -1;
        return ans;
    }
}