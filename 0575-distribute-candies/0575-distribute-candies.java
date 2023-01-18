class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length/2;
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
        int setSize=set.size();
        int ans=0;
        if(setSize<n){
            ans=setSize;
        }
        if(setSize>=n){
            ans=n;
        }
        return ans;
    }
}