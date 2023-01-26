class Solution {
    public String largestNumber(int[] nums) {
         if(nums.length==0){
           return "";
       }

       String[] sa=new String[nums.length];
       for(int i=0;i<nums.length;i++){
           sa[i]=Integer.toString(nums[i]);                       // learn converting integer to string
       }
       Arrays.sort(sa, new Comparator<String>() {                // learn comparator
           @Override
           public int compare(String a, String b) {
               String o1=a+b;
               String o2=b+a;
               return o2.compareTo(o1);
           }
       });

       if(sa[0].equals("0"))
           return "0";

       
       StringBuilder sb = new StringBuilder();                // what is String builder
       for(String s:sa){
           sb.append(s);
           
       }
        return sb.toString();                                  // converting stringbuilder to string
    }
}