class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0||nums.length==1)
            return nums.length;
        int i=0;
        for(int j=0;j<nums.length-1;j++)
        {
            if(nums[j]!=nums[j+1])
            {
                nums[i++]=nums[j];
            }
        }
        nums[i++]=nums[nums.length-1];
        return i;
    }
}