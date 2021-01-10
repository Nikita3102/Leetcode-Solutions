class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        char temp;
        if(s.length()%2==1)
            return false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
            {
                stack.push(s.charAt(i));
                continue;
            }
            if(stack.isEmpty())
            {
                return false;
            }
            if(s.charAt(i)==')')
            {
                temp=stack.pop();
                if(temp!='(')
                    return false;
            } 
            else if(s.charAt(i)==']')
            {
                temp=stack.pop();
                if(temp!='[')
                    return false;
            }
             else if(s.charAt(i)=='}')
            {
                temp=stack.pop();
                if(temp!='{')
                    return false;
            }
            
        }
        return (stack.isEmpty());
    }
}