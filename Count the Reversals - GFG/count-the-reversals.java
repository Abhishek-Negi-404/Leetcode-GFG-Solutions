//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countRev (String s)
    {   // oddlength => cannot balance
        if(s.length()%2==1) return -1;
        // counts for invalid open and closed braces
        int openCount = 0;
        int closeCount = 0;
        
		Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            // when character is '{' --> push
            if(c=='{'){
                openCount++;    // increasing count for all open braces
                st.push(c);
            }
            // when character is '}' --> pop '{' at peek || push 
            else{   
                if(st.size()>0 && st.peek()=='{'){
                    openCount--;    // decreasing count for --> open valid braces
                    st.pop();   // removeing valid open braces
                }else{
                    st.push(c);    // push invalid clodes braces
                    closeCount++;   // increasing count for --> closed invalid braces
                }
            }
        }
        // formula expression for number of reversals
        int ans = (openCount+1)/2 + (closeCount+1)/2;
        return ans;
    }
}