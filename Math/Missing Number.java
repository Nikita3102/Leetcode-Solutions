class Solution {
    public int missingNumber(int[] nums) {
        int count=((nums.length)*(nums.length+1))/2;
        for(int i=0;i<nums.length;i++)
        {
            count-=nums[i];
        }
        return count;
    }
}