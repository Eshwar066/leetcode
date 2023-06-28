class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0) return 0;
        Queue<int[]> q=new LinkedList<>();
        int row=grid.length;
        int col=grid[0].length;
        int count_f=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }else if(grid[i][j]==1){
                    count_f++;
                }
            }
        }
        if(count_f==0) return 0;
        int count=0;
        int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            count++;
             int size=q.size();
            for(int i=0;i<size;i++){
                int[] point=q.poll();
                for(int[] dir:dirs){
                    int x=point[0]+dir[0];
                    int y=point[1]+dir[1];
                    if(x<0|| y<0|| x>=row || y>=col || grid[x][y]==0 || grid[x][y]==2) continue;
                    
                    grid[x][y]=2;
                    count_f--;
                    q.offer(new int[]{x,y});
                }
            }
        }
        return count_f == 0 ? count-1 : -1;
    }
}