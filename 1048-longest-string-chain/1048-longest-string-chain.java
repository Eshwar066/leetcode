class Solution {                                                   //Algo made easy
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)->a.length()-b.length());
        Map <String,Integer> memo=new HashMap<>();
        int res=0;

        for(String word:words){
            memo.put(word,1);
        
        for(int i=0;i<word.length();i++){
            StringBuilder current=new StringBuilder(word);
            String next=current.deleteCharAt(i).toString();
            if(memo.containsKey(next)){
                memo.put(word,Math.max(memo.get(word),memo.get(next)+1));
            }
        
        }
        res=Math.max(res,memo.get(word));
        }
        return res;
    }
}