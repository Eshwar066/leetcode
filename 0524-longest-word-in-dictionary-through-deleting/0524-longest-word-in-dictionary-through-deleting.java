class Solution {                                                          //Algo made easy
    public String findLongestWord(String s, List<String> dictionary) {
        String result="";
        dictionary.sort((String a,String b)-> a.length()==b.length()? a.compareTo(b) : b.length()-a.length());
        for(String str:dictionary){
            if(isSubsequence(s,str)) return result=str;
        }
        return result;
    }
    public boolean isSubsequence(String S, String D){
        int i=0, j=0;
        if(D.length()>S.length()) return false;
        while(i<S.length() && j<D.length()){
            if(S.charAt(i)==D.charAt(j))j++;
            i++;
        }
        return j==D.length();
    }
}