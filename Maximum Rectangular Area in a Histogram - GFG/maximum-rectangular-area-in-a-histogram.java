//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}




// } Driver Code Ends


class Solution
{
    // function to return indices of  previous smaller element(PSE)
    public static long[] prevSmallerIdx(long arr[],int n){
        Stack <Integer> s = new Stack<>();
        long ans[] = new long[n];
        // traverse from L-->R for PSE
        for(int i=0;i<n;i++)
        {   // if peek() is greater --> pop() until peek() is smaller   
            while(s.size()>0 && arr[s.peek()]>=arr[i])
            s.pop();
            
            if(s.isEmpty()) ans[i] = -1;   // empty stack --> no smaller element
            
            else ans[i] = s.peek();  // peek is smaller --> store
            
            s.push(i);    // push greater element index
        }
        return ans;
    }
    
    // function to return indices of  next smaller element(NSE)
    public static long[] nextSmallerIdx(long arr[],int n){
        Stack <Integer> s = new Stack<>();
        long ans[] = new long[n];
        // traverse from R-->L for NSE
        for(int i=n-1;i>=0;i--)
        {   // peek is greater --> pop() until peek() is smaller
            while(s.size()>0 && arr[s.peek()]>=arr[i])
            s.pop();
            
            if(s.isEmpty()) ans[i] = n;    // empty stack --> no smaller element
            
            else ans[i] = s.peek();    // peek is smaller --> store
            
            s.push(i);    // push greater element index
        }
        return ans;
    }
    
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        long prev[] = prevSmallerIdx(hist,(int)n);
        long next[] = nextSmallerIdx(hist,(int)n);
        
        long maxArea = 0;
        for(int i=0;i<n;i++)
        {
            long area = hist[i] * (next[i] - prev[i] - 1);  // area = length * breadth
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
        
}



