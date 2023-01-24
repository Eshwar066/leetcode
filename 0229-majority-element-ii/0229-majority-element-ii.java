class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int e1=0, e2=0,c1=0,c2=0;
        for(int n:nums) {
        if(n==e1){
            c1++;
        } else if (n==e2) {
            c2++;
        } else if (c1==0) {
            e1=n;
            c1=1;
        } else if (c2==0) {
            e2=n;
            c2=1;
        }else{
            c1--;
            c2--;
        }
        }
//    verification
        c1=0;
        c2=0;
        for(int n:nums){
            if(e1==n){
                c1++;
            } else if (e2==n) {
                c2++;
            }

        }

        ArrayList<Integer>List=new ArrayList<>();
        if(c1>nums.length/3){
            List.add(e1);
        }
        if(c2> nums.length/3){
            List.add(e2);
        } 
        return List;
    }
}