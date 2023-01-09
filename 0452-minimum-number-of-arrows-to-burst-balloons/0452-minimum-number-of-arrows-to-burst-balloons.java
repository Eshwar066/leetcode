class Solution {                                                    //check notes for similar problems(pepcoding)
    public int findMinArrowShots(int[][] points) {
        if(points.length==0) return 0;
        Arrays.sort(points,(a,b)-> Integer.compare(a[1],b[1]));      //comparing 2D array n sorting
        int arrow=1;
        int end=points[0][1];                       
        for(int i=0;i<points.length;i++){
            if(points[i][0]>end){
                arrow++;
                end=points[i][1];
            }
        }
        return arrow;
    }
} 