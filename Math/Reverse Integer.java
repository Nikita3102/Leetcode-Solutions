class Solution {
    public int reverse(int x) {
        long result=0;
        boolean negative=false;
        if(x<0)
        {
            negative=true;
            x=x*-1;
        }
        while(x>0)
        {
            result=(result*10)+(x%10);
            x/=10;
        }
        if(result>Integer.MAX_VALUE)
            return 0;
        if(negative==true)
            result=result*-1;
        
        return (int)result;
}
}