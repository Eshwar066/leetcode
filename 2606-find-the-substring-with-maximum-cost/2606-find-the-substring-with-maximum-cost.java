// class Solution {
//     public int maximumCostSubstring(String s, String chars, int[] vals) {
//          HashMap<Character, Integer> charValues = new HashMap<>();
//         for (int i = 0; i < chars.length(); i++) {
//             charValues.put(chars.charAt(i), vals[i]);
//         }
        
//         int maxCost = 0;
//         int currentCost = 0;
//         for (int i = 0; i < s.length(); i++) {
//             // calculate the cost of the current substring
//             currentCost += charValues.getOrDefault(s.charAt(i), (int) s.charAt(i) - 'a' + 1);
            
//             // if the current cost is negative, reset it to 0
//             currentCost = Math.max(currentCost, 0);
            
//             // update the maximum cost seen so far
//             maxCost = Math.max(maxCost, currentCost);
//         }
//         return maxCost;
//     }
// }

class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
         int[] v = new int[26];
    int max_cost = 0, cost = 0;
    for (int i = 0; i < 26; i++) {
        v[i] = i + 1;
    }
    for (int i = 0; i < chars.length(); i++) {
        v[chars.charAt(i) - 'a'] = vals[i];
    }
    for (char ch : s.toCharArray()) {
        cost = Math.max(0, cost + v[ch - 'a']);
        max_cost = Math.max(max_cost, cost);
    }
    return max_cost;
    }
}



