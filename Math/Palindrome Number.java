class Solution {
    public boolean isPalindrome(int x) {
      int reversed=0,rem,num=x;
        while(x>0)
        {
            rem=x%10;
            reversed=reversed*10+rem;
            x/=10;
        }
        if(num==reversed)
            return true;
        return false;
    }
}