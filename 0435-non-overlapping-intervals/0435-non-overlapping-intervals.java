class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]==b[1]? b[0]-a[0] :a[1]-b[1]);
        int count=0;
        int prevEnd=Integer.MIN_VALUE;
       
        for(int[] interval:intervals){
            if(prevEnd>interval[0]){
                count++;
            }else{
                prevEnd=interval[1];
            }
        }
        return count;
    }
}