class Solution {
// returns indices of  next smaller element(NSE)
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

// returns indices of previous smaller element(PSE)
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
    
// returns max area int the give array
    public int largestRectangleArea(int[] heights,int n) 
    {
        int next[] = nextSmallerIdx(heights,n);
        int prev[] = prevSmallerIdx(heights,n);
        
        int maxArea = 0;
        for(int i=0;i<n;i++)
        {   // using derived formula for width
            int area = heights[i] * (next[i] - prev[i] - 1);    // area = length * breadth
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
    
//========================================================================================================== 
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int ans[] = new int[m];
        
        int maxArea = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]=='0')   // base is 0 --> no building on graph
                    ans[j] = 0;
                else ans[j] += 1;   // add element to current building
            }
            
            int area = largestRectangleArea(ans,m);    // treating row as histogram to find max area
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}