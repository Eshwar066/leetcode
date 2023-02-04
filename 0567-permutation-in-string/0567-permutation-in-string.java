class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int a[]=new int[26];
        for(int i=0;i<s1.length();i++)
            a[s1.charAt(i)-'a']++;
        int b[]=new int[26];
        for(int i=0;i<s2.length();i++)
        {
            if(i<s1.length())
            {
                b[s2.charAt(i)-'a']++;
                // if(i<s1.length()-1)continue ;
            }
            else
            {
                b[s2.charAt(i)-'a']++;
                b[s2.charAt(i-s1.length())-'a']--;
            }
            if(match(a,b))
                return true;
        }
        return false;
    } 
    static boolean match(int a[],int b[])
    {
        for(int i=0;i<26;i++)
        {
            if(a[i]!=b[i])
                return false;
        }
        return true;

    }    
}
