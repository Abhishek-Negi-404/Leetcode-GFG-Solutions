//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	Stack<Integer> s = new Stack<>();
		
		//step1: push all element in stack
		for(int i=0;i<n;i++)
				s.push(i);

		//step2: get 2 elements and copare them
		while(s.size()>1)
		{
			int a = s.peek();
			s.pop();
			int b = s.peek();
			s.pop();

			if(M[a][b]==1) s.push(b);    // a knows b
				
			else if(M[b][a]==1) s.push(a);    // b knows a
		}
		// potential celebrity candidate
		int ans = s.peek();
		
		//step3: single element in stack is potential celeb ==> so verify it
		int zeroCount = 0;
		int oneCount = 0;
		for(int i=0;i<n;i++)
			{
				if(M[ans][i]==0) zeroCount++;
				if(M[i][ans]==1) oneCount++;
			}
		
		if(zeroCount!=n) return -1;    // all zeroes --> celebrity knows no one
		if(oneCount!=n-1) return -1;    // n-1 ones --> everyone knows celebrity(excluding self)

		return ans;    // celebrity confirmed
    }
}