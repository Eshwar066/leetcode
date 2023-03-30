//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
       ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
                pos.add(arr[i]);
            else
                neg.add(arr[i]);
        }
        int i=0;
        int j=0;
        while(i<pos.size() && j<neg.size())
        {
            ans.add(pos.get(i));
            i++;
            ans.add(neg.get(j));
            j++;
        }
        for(int k=i;k<pos.size();k++)
        {
            ans.add(pos.get(k));
        }
        for(int k=j;k<neg.size();k++)
        {
            ans.add(neg.get(k));
        }
        int k=0;
        for(Integer in:ans)
        {
            arr[k] = in;
            k++;
        }
    }
}