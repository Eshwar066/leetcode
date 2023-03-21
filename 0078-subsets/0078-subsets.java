class Solution {                                                //TakeUforward Recursion L-6
    
   public void findSubsets(int[] nums, int index ,ArrayList<Integer> list, List<List<Integer>> ans){
        ans.add(new ArrayList<Integer>(list));
        
        for(int  i = index ; i<nums.length ; i++){
            if(i!=index && nums[i] == nums[i-1]) continue;
            
            list.add(nums[i]);
            findSubsets(nums, i+1 , list, ans);
            list.remove(list.size()-1);
        }
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        findSubsets(nums, 0 , new ArrayList<Integer>(), ans);
        return ans;
    }
}

//Time Complexity: O(2^n) for generating every subset and O(k)  to insert every subset in another data structure if the average length of every subset is k. Overall O(k * 2^n).

//Space Complexity: O(2^n * k) to store every subset of average length k. Auxiliary space is O(n)  if n is the depth of the recursion tree.