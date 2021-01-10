class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] res=new int[2];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                res[0]=i;
                res[1]=map.get(target-nums[i]);
                return res;
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return res;
    }
}