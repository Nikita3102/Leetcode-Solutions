class Solution {
    public int splitArray(int[] nums, int m) {
        int start=0,end=0;
        if(m>nums.length)
        {
            return -1;
        }
        for(int i=0;i<nums.length;i++)
        {
            end+=nums[i];
            if(start<nums[i])
            {
                start=nums[i];
            }
        }
        int res=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(isValid(nums,m,mid)==true)
            {
                res=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return res;
    }
    
    public boolean isValid(int nums[],int m,int mx)
    {
        int s=1,sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum>mx)
            {
                s++;
                sum=nums[i];
            }
            if(s>m)
            {
                return false;
            }
        }
        return true;        
    }
}