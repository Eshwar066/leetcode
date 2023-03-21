// class Solution {                               //takeUforward beats 50%
    
//     public void findSubsets(int[] nums, int index , ArrayList<Integer> list, List<List<Integer>> ans){
        
//         ans.add(new ArrayList<Integer>(list));
//         for(int i = index ; i < nums.length ; i++){
//             if(i!=index && nums[i] == nums [i-1]) continue;
//             list.add(nums[i]);
//             findSubsets(nums, i+1 , list , ans);
//             list.remove(list.size()-1);
//         }
//     }
//     public List<List<Integer>> subsetsWithDup(int[] nums) {
//         Arrays.sort(nums);
//         List<List<Integer>> ans = new ArrayList<>();
//         findSubsets(nums, 0, new ArrayList<Integer>(), ans);
//         return ans;
//     }
// }

class Solution {                                            //beats 100%
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int resultSize = 1;
        Arrays.sort(nums);
        result.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int startIndex = 0;

            if (i > 0 && nums[i] == nums[i - 1]) {
                startIndex = resultSize;
            }
            resultSize = result.size();
            while (startIndex < resultSize) {
                List<Integer> list = new ArrayList<>(result.get(startIndex));
                list.add(nums[i]);
                result.add(list);
                startIndex++;
            }
        }
        return result;
    }
}