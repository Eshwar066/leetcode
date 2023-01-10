class Solution {                                                            //striver(code edited)
    public int[] maxSlidingWindow(int[] nums, int k) {
       int n=nums.length;
       int[] r=new int[n-k+1];
        int ri=0;
        // store index
        Deque<Integer> q=new ArrayDeque<>();            //remove elements from front
        for(int i=0;i<nums.length;i++){
            //remove elements that are out of bound
            if(!q.isEmpty() && q.getFirst()==i-k){
                q.removeFirst();
            }
            //remove samller numbers in k range as they are useless
            while(!q.isEmpty() && nums[q.getLast()]<nums[i]){
                q.removeLast();
            }
            q.addLast(i);
            if(i>=k-1){
                r[ri]=nums[q.getFirst()];
                ri++;
                
            }
        }
        return r;
    }
}