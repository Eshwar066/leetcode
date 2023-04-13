class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack <Integer> stack=new Stack<>();
        int i=0;
        int j=0;
        int n=pushed.length;
        while(i<n && j<n){
            
            stack.push(pushed[i]);
            while(!stack.isEmpty() && j<n && stack.peek()==popped[j]){
                stack.pop();
                j++;
            }
            i++;   
        }
        return  i==n && j==n && stack.isEmpty();
    }
}