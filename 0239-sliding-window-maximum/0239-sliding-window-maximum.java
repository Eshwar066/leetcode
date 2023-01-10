class Solution {                                                            //striver
    public int[] maxSlidingWindow(int[] nums, int k) {
       int n=nums.length;
       int[] r=new int[n-k+1];
        int ri=0;
        // store index
        Deque<Integer> q=new ArrayDeque<>();            //remove elements from front
        for(int i=0;i<nums.length;i++){
            //remove elements that are out of bound
            if(!q.isEmpty() && q.peek()==i-k){
                q.poll();
            }
            //remove samller numbers in k range as they are useless
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1){
                r[ri++]=nums[q.peek()];
                
            }
        }
        return r;
    }
}