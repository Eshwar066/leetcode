class Solution {
   public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) {
            return "";
        }

       
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int required = map.size();
        int a = 0, b = 0; 
        int minLength = Integer.MAX_VALUE; 
        int start = 0; 
        int matched = 0;

       
        Map<Character, Integer> windowMap = new HashMap<>();

        while (b < s.length()) {
            char endChar = s.charAt(b);
         
            windowMap.put(endChar, windowMap.getOrDefault(endChar, 0) + 1);

           
            if (map.containsKey(endChar) && windowMap.get(endChar).equals(map.get(endChar))) {
                matched++;
            }

        
            while (matched == required) {
            
                if (b - a + 1 < minLength) {
                    minLength = b - a + 1;
                    start = a;
                }

                char startChar = s.charAt(a);
           
                windowMap.put(startChar, windowMap.get(startChar) - 1);

           
                if (map.containsKey(startChar) && windowMap.get(startChar) < map.get(startChar)) {
                    matched--;
                }

                a++; 
            }

            b++;
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }
}