class Solution {
    public int myAtoi(String s) {
   if(s==null || s.isEmpty())
       return 0;
        int sign=1,i=0,n=s.length();
        while(i<n && s.charAt(i)==' ')
            i++;
        if(i>=n)
            return 0;
        if(s.charAt(i)=='+'||s.charAt(i)=='-')
            sign = s.charAt(i++) == '+' ? 1 : -1;
        long res=0;
        while(i<n && Character.isDigit(s.charAt(i)))
        {
            res=res*10+(s.charAt(i++)-'0');
            if(res*sign > Integer.MAX_VALUE || res * sign < Integer.MIN_VALUE)
                return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return (int)(res*sign);
    }
}