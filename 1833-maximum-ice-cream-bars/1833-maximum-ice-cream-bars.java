class Solution {                                         //coded by me
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum=0,count=0,ans=0;
     for(int i=0;i<costs.length;i++){
            if(costs[i]<coins && sum<=coins){
                sum=sum+costs[i];
                count++;
            }
         if(sum>coins){
             break;
         }
        ans=count;
        }
        return ans;
    }
}