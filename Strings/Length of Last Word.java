class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int len=s.length()-1;
        while(s.charAt(len)==' ' && len>0)
        {
            len--;
        }
        for(int i=len;i>=0;i--)
        {
            if(s.charAt(i)==' ')
                break;
            else
                count++;
        }
        return count;
    }
}