class Solution {
    public String reverseWords(String s) {
      String[] words=s.split(" +");                   //coverting to arr, spliting the string based on spaces.
      StringBuilder sb=new StringBuilder();           //creating string builder and adding elements of arr to sb.
      for(int i=words.length-1;i>=0;i--){
          sb.append(words[i]);
          sb.append(" ");
      }  
       return sb.toString().trim();                   //converting sb to string n triming it to remove spaces
    }
}