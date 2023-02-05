class Solution {
    public int repeatedStringMatch(String a, String b) {
        String str=a;
        int count=1;
        int repeat=b.length()/a.length();
        for(int i=0; i<repeat+2; i++){
            if(a.contains(b)) {
                return count;
            }
            else{
                a+=str;
                count++;
            }
        }
        return -1;
    }
}