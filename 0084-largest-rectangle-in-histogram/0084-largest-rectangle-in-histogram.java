class Solution {

// indices of  next smaller element(NSE)========================================================
    public int[] nextSmallerIdx(int arr[],int n){
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

// indices of previous smaller element(PSE)=====================================================
    public int[] prevSmallerIdx(int arr[],int n){
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
    
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int next[] = nextSmallerIdx(heights,n);
        int prev[] = prevSmallerIdx(heights,n);
        
        int maxArea = 0;
        for(int i=0;i<n;i++)
        {
            // int l = heights[i];
            // int b = next[i] - prev[i] - 1;  // derived formula
            // int area = l*b;
            int area = heights[i]* (next[i] - prev[i] - 1);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
}