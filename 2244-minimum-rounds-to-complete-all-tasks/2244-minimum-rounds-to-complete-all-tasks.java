class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
       int res=0;
       for(int i=0;i<tasks.length;){
           int j=i;
           while(i<tasks.length && tasks[i]==tasks[j]){
               i++;
           }
           if(i-j==1) return(-1);
           res+=(i-j+2)/3;

       }
        return(res); 
    }
}