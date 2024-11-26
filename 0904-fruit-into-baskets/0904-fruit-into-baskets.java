class Solution {
    public int totalFruit(int[] fruits) {  
        int FC=0,l=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int r=0;r<fruits.length;r++){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            
            if(map.size()>2){
                map.put(fruits[l],map.get(fruits[l]) - 1);
                if(map.get(fruits[l])==0){
                    map.remove(fruits[l]);
                    
                }
                l++;
            }
            FC=Math.max(FC,r-l+1);
        }
        return FC;
    }
}