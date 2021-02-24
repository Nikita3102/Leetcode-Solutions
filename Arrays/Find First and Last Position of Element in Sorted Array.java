class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        result[0]=findStartingIndex(nums,target);
        result[1]=findEndingIndex(nums,target);
        return result;
        }
    public int findStartingIndex(int nums[],int target)
    {
        int start=0,end=nums.length-1,res=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                res=mid;
                end=mid-1;
            }
            else
                if(target<nums[mid])
                {
                    end=mid-1;
                }
            else
            {
                start=mid+1;
            }
        }
        return res;
    }
    public int findEndingIndex(int nums[],int target)
    {
        int start=0,end=nums.length-1,res=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                res=mid;
                start=mid+1;
            }
            else
                if(target<nums[mid])
                {
                    end=mid-1;
                }
            else
            {
                start=mid+1;
            }
        }
        return res;
    }
}