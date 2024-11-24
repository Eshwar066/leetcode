class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
//         int l = 0; 
        
//         while (l < nums.length) {
//             int startNum = nums[l];
//             for (int i = l + 1; i < nums.length; i++) {
//                 if (nums[i] == startNum && i - l <= k) { 
//                     return true;
//                 }
//             }
//             l++; 
//         }
//         return false; 
//     }
    Map<Integer, Integer> map = new HashMap<>(); // Store numbers and their last seen index

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) { // If the number is already in the map
                int prevIndex = map.get(nums[i]); // Get its previous index
                if (i - prevIndex <= k) { // Check if the difference is <= k
                    return true; // Valid nearby duplicate found
                }
            }
            map.put(nums[i], i); // Update the last index of the current number
        }

        return false; 
    }
}