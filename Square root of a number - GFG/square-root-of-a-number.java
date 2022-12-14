//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
		if(x==0 || x ==1){// base cases
		    return x;
		}
		int i = 1;// variable initialised to 1
		int ans = 1;
		
		while(ans<=x)// until ans is equal or smaller to input
		{
		    i++;// increment
		    ans = i*i;
		}
		return i-1;// floor of number
	 }
}
