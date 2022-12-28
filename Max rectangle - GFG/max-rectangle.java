//{ Driver Code Starts
import java.util.*;

class FindMinCost
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().maxArea(arr, n, m));
		t--;
		}
	}
}
// } Driver Code Ends


/*Complete the function given below*/
class Solution {
// returns indices of previous smaller element(PSE)
    public int[] PSE(int arr[],int n){
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[n];
        // traverse from L-->R for PSE
	    for(int i=0;i<n;i++)
	    {  // if peek() is greater --> pop() until peek() is smaller   
	       while(s.size()>0 && arr[s.peek()]>=arr[i])
	           s.pop();
	       
	       if(s.isEmpty()) ans[i] = -1;   // empty stack --> no smaller element
	       
	       else ans[i] = s.peek();  // peek is smaller --> store
	       
	       s.push(i);  // push greater element index
	    }
        return ans;
    }
    
// returns indices of  next smaller element(NSE)
    public int[] NSE(int arr[],int n){
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[n];
        // traverse from R-->L for NSE
	    for(int i=n-1;i>=0;i--)
	    {  // peek is greater --> pop() until peek() is smaller   
	       while(s.size()>0 && arr[s.peek()]>=arr[i])
	           s.pop();
	       
	       if(s.isEmpty()) ans[i] = n;   // empty stack --> no smaller element
	       
	       else ans[i] = s.peek();  // peek is smaller --> store
	       
	       s.push(i);  // push greater element index
	    }
        return ans;
    }
    
// returns max area int the given array
    public int areaInCurr(int arr[], int n){
        int prev[] = PSE(arr,n);
        int next[] = NSE(arr,n);
        
        int area = 0;
        for(int i=0;i<n;i++)
        {   // area = length * breadth
            area = Math.max(area,arr[i] * (next[i]-prev[i]-1));
        }
        return area;
    }
    
//===========================================================================================
    public int maxArea(int M[][], int n, int m) {
        int arr[] = new int[m];
        int ansArea = 0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(M[i][j]==0) arr[j] = 0;      // base is 0 --> no building on graph
                else arr[j] += 1;       // add element to current building
            }
            ansArea = Math.max(ansArea,areaInCurr(arr,m));
        }
        return ansArea;
    }
}