

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            map.put(i, 1 + map.getOrDefault(i, 0));
            set.add(i);
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        while (!map.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            for (int key : set) {
                if (map.containsKey(key)) {
                    int cnt = map.get(key); 
                    row.add(key);   
                    if (cnt == 1) {
                        map.remove(key);   
                    } else {
                        map.put(key, --cnt);
                    } 
                }  
            }
            ans.add(row);
        }
        
        return ans;
    }
}


// class Solution {
//     public List<List<Integer>> findMatrix(int[] nums) {
//        Map<Integer, Integer> mp = new HashMap<>();
//         for (int i : nums) {
//             mp.put(i, mp.getOrDefault(i, 0) + 1);
//         }
//         List<List<Integer>> ans = new ArrayList<>();
//         while (!mp.isEmpty()) {
//             List<Integer> a = new ArrayList<>();
//             List<Integer> arr = new ArrayList<>();
//             for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
//                 int key = entry.getKey();
//                 a.add(key);
//                 mp.put(key, mp.get(key) - 1);
//                 if (mp.get(key) == 0) {
//                     arr.add(key);
//                 }
//             }
//             ans.add(a);
//             for (int i : arr) {
//                 mp.remove(i);
//             }
//         }
//         return ans;
//     }
// }