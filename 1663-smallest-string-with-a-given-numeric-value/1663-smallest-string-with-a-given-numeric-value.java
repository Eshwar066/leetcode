// class Solution {                           //Algo made easy
//     public String getSmallestString(int n, int k) {
//         char[] c=new char[n];
        
//         for(int i=n-1; i>=0; i--){
//             int val=Math.min(26,k - i);
//             c[i] = (char)('a' + val-1);
//             k=k-val;
//         }
//         return new String(c);
//     }
// }

class Solution {                           //Algo made easy
    public String getSmallestString(int n, int k) {
        
        
        //a...a (some character) zz...zzz
         k=k-n;
        int zCount=k/25;
        int value = k%25;
        
        char[] c =new char[n];
        
        int i=n-1;
        while(zCount!=0){
            c[i]='z';
            i--;
            zCount--;
        }
        
        if(value>0){
        c[i] = (char)('a'+value);
        i--;
        }
        
        while(i>=0){
            c[i]='a';
            i--;
        }
        return new String(c);
        
    }
}