class Solution {                                       //Nick white
    public List<String> generateParenthesis(int n) {   //Back tracking
        List<String> output_arr= new ArrayList();
        backtrack(output_arr,"",0,0,n);
        return output_arr;
    }
    public void backtrack(List<String> output_arr,String current_str, int open, int close,int max ){
        if(current_str.length()==max*2){
            output_arr.add(current_str);
            return;
        }
        
        if(open<max) backtrack(output_arr, current_str + "(",open+1,close,max);
        if(close<open) backtrack(output_arr, current_str + ")",open,close+1,max);
    }
}