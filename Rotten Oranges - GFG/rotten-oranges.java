//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        // Code here
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