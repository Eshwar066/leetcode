class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
     int l=0,r=0,cnt=0;
        
    Map<String, Integer> map = new HashMap<>();
        
    List<String> result = new ArrayList<>();   
        while(r < s.length()){
          cnt++;
            if(cnt==10){
                String sub = s.substring(l,r+1);
                map.put(sub , map.getOrDefault(sub,0)+1);
                
                if(map.get(sub)==2){
                    result.add(sub);
                }
                cnt--;
                l++;
            }
            r++;
        }
        return result;
    }
}