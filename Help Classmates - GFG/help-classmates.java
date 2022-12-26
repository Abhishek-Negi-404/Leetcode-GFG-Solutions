//{ Driver Code Starts
//Initial Template for Java


import java.util.*; 
import java.io.*; 

class GFG 
{ 
	public static void main (String[] args) { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }

            Solution ob = new Solution();

            int ans[] = ob.help_classmate(array,n);

           	for (int i=0; i<n; i++) 
                System.out.print(ans[i]+" "); 
            System.out.println();
            t--;
        }
	} 
} 


// } Driver Code Ends


//User function Template for Java

class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    Stack<Integer> s = new Stack<>();
	    s.push(-1);    // for corner element
	    int ans[] = new int[n];
	    // traverse from R-->L for NSE
	    for(int i=n-1;i>=0;i--)
	    {   // compare peek() with current element
	        // if peek() is smaller --> store peek() and push
	        if(s.peek()<arr[i]){
	            ans[i] = s.peek();
	            s.push(arr[i]);
	        }else{
	            // if peek is greater --> pop() until peek() is smaller   
	            while(s.peek()>=arr[i]){
	                s.pop();
	            }
	            // store peek() and push
	            ans[i] = s.peek();
	            s.push(arr[i]);
	        }
	    }
	    return ans;
	} 
}
