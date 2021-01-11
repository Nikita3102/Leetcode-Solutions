class Solution {
    public String removeOuterParentheses(String S) {
        int count=0;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='(' && count++>0)
                sb.append(S.charAt(i));
            if(S.charAt(i)==')' && --count>0)
                sb.append(S.charAt(i));    
        }
        return sb.toString();
    }
}