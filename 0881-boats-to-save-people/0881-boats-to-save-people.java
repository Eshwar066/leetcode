class Solution {
    public int numRescueBoats(int[] people, int limit) {
       int l=0,r=people.length-1;
        Arrays.sort(people);
        int count=0;
        while(l<=r){
            int sum=people[l]+people[r];
            if(sum<=limit){
                count++;
                l++;
                r--;
            }else{
                count++;
                r--;
            }
        }
        return count;
    }
}