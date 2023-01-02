class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;

        int curr_sum=0,pos=0;

        for(int i=0;i<k;i++){
            curr_sum+=Math.abs(x-arr[i]);
        }

        int sum=curr_sum;

        for(int i=1;i<=n-k;i++){
            curr_sum-=Math.abs(x-arr[i-1]);
            curr_sum+=Math.abs(x-arr[i+k-1]);
            if(curr_sum<sum){
                sum=curr_sum;
                pos=i;
            }
        }
        List<Integer> answer = new ArrayList<>();

        for(int i=0;i<k;i++){
            answer.add(arr[i+pos]);
        }
        return answer;
    }
}