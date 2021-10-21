// { Driver Code Starts
// C++ program to evaluate value of a postfix expression

#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
class Solution
{
    public:
    //Function to evaluate a postfix expression.
    int evaluatePostfix(string s)
    {
        // Your code here
        int i, op1, op2;
        stack<int> stack;
        char ch;
        for(int i=0; i<s.length(); i++)
        {
            ch = s.at(i);  
            
            if(isdigit(ch))
            {
                stack.push(ch-'0');
            }
            
            else
            {
                op2 = stack.top();
                stack.pop();
                op1 = stack.top();
                stack.pop();
                
                switch(ch)
                {
                    case '+':
                        stack.push(op1+op2);
                        break;
                    case '-':
                        stack.push(op1-op2);
                        break;
                    case '*':
                        stack.push(op1*op2);
                        break;
                    case '/':
                        stack.push(op1/op2);
                        break;
                }
            }
                
        }
        return stack.top();
    }
};

// { Driver Code Starts.

// Driver program to test above functions
int main()
{
    int t;
    cin>>t;
    cin.ignore(INT_MAX, '\n');
    while(t--)
    {
        string S;
        cin>>S;
        Solution obj;
    
    cout<<obj.evaluatePostfix(S)<<endl;
    }
    return 0;
}
  // } Driver Code Ends
