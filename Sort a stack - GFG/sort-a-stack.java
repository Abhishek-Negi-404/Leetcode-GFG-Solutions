//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG{
    public void sortedInsert(Stack<Integer> s,int num){
        // base cases => either empty or peek is smaller
        if(s.isEmpty() || s.peek()<num){
            s.push(num);// sorted insert
            return;
        }
        
        int top = s.peek();// stored
        s.pop();
        // recursive call
        sortedInsert(s,num);
        
        s.push(top);// put back
    }
    
	public Stack<Integer> sort(Stack<Integer> s)
	{
		if(s.isEmpty()) return s;// base case
		
		int top = s.peek();// stored
		s.pop();
		// recursive call
		Stack<Integer> ans = sort(s);
		// insert in sorted way
		sortedInsert(ans,top);
		return ans;
	}
}