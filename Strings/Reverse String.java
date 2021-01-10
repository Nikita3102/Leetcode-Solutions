class Solution {
    public void reverseString(char[] s) {
     int n=s.length;
        int l=0,r=n-1;
        char temp;
        while(l<r)
        {
            temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
    }
}