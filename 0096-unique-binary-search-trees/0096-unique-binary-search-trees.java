class Solution {
    public int numTrees(int n) {
       long res=1;
       for(int i=1;i<=n;i++){
           res*=(n+i);
           res/=i;
       } 
       return (int)(res/(n+1));
    }
}