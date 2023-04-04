class Solution {
    public int partitionString(String s) {
        int count=0;
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i)-'a')){
                count++;
                set.clear();
                set.add(s.charAt(i)-'a');
            }else{
                set.add(s.charAt(i)-'a');
            }
        }
        count++;
        return count;
    }
}