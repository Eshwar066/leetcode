class Solution {                              // in this problem,check int vs long..for test case check this 1534236469
    public int reverse(int x) {
       
        int digit=0,rev=0;
        long sum=0;
        while(x!=0){
        digit=x%10;
        
        sum=sum*10+digit;
        x=x/10;
        }
        if(sum<-2147483648 || sum>2147483647){
            return 0;
        }
        int check=(int) sum;
        return check;
    }
}

