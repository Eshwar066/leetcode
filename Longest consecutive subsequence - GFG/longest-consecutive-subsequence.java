//{ Driver Code Starts
//Initial Template for Java

import java.math.*;
import java.util.*;
import java.io.*;

class Driverclass
{
    // Driver Code
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }
    }
    
	public static void main(String args[])
	{
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
		    out.println(new Solution().findLongestConseqSubseq(a, n));
		    t--;
		}
		out.flush();
	}
}
// } Driver Code Ends


//User function Template for Java



class Solution{                                                //completed-1
    static int findLongestConseqSubseq(int arr[], int N){
        Set<Integer> hashset= new HashSet<Integer>();
       for(int num:arr){
            hashset.add(num);
       }

       int longestStreak=0;
       for(int num:arr){
           if(!hashset.contains(num-1)){
               int currentNum=num;
               int currentStreak=1;

               while(hashset.contains(currentNum+1)){
                  currentNum=currentNum+1;
                  currentStreak=currentStreak+1;  
               }
               longestStreak=Math.max(longestStreak,currentStreak);
              
           }
       } 
       return longestStreak;
    }
}