class Solution {
    public boolean canJump(int[] nums) {
        int lastGoodIndex=nums.length-1;  // chech from last whether you can reach stating index or not
        for(int i=nums.length-1;i>=0;i--)
        {
            if(i+nums[i]>=lastGoodIndex)
            {
                lastGoodIndex=i;
            }
        }
        return lastGoodIndex==0;
    }
}