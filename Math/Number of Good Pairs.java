class Solution {
    public int numIdenticalPairs(int[] nums) {
        int frequency[]=new int[101];
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            count+=frequency[nums[i]]++;
        }
        return count;
    }
}