class Solution {
    public int secondHighest(String s) {
         Set<Integer> set = new HashSet();
        
        for (char c : s.toCharArray())
            if (Character.isDigit(c)) set.add(Integer.parseInt(String.valueOf(c)));
        
        int maximum = 0;
        for (int i : set) maximum = Math.max(i, maximum);

        int n = Integer.MIN_VALUE;
        for (int i : set)
            if (i < maximum) n = Math.max(i, n);

        return n < 0 ? -1 : n;
    }
}