class Solution {
    static final int max=1000;
    public int longestCommonSubsequence(String text1, String text2) {
        int l1=text1.length();
        int l2=text2.length();
        int dp[][]=new int[l1][max];
        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        return lcs(text1,text2,l1,l2,dp);
    }
    public int lcs(String text1,String text2,int l1,int l2,int dp[][])
    {
        if(l1==0||l2==0)
            return 0;
        if(dp[l1-1][l2-1]!=-1)
            return dp[l1-1][l2-1];
        if(text1.charAt(l1-1)==text2.charAt(l2-1))
        {
            dp[l1-1][l2-1]=1+lcs(text1,text2,l1-1,l2-1,dp);
            return dp[l1-1][l2-1];
        }
        else
        {
            dp[l1-1][l2-1]=Math.max(lcs(text1,text2,l1-1,l2,dp),lcs(text1,text2,l1,l2-1,dp));
            return dp[l1-1][l2-1];
        }
    }
}