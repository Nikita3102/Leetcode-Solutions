class Solution {
    public String removeDuplicates(String S) {
        char[] stack=new char[S.length()];
        int i=0; //stack index 
        for(int j=0;j<S.length();j++)
        {
            char current=S.charAt(j);
            if(i>0 && stack[i-1]==current) //i>0 means stack is not empty.
            {
                i--;
            }
            else
            {
                stack[i++]=current;
            }
        }
        return new String(stack,0,i);
    }
}