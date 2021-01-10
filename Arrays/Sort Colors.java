class Solution {
    public void sortColors(int[] nums) {
        int c0=0,c1=0,c2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                c0++;
            }
            else
                if(nums[i]==1)
                {
                    c1++;
                }
            else
                if(nums[i]==2)
                {
                    c2++;
                }
        }
        int k=0;
        while(c0>0)
        {
            nums[k++]=0;
            c0--;
        }
        while(c1>0)
        {
            nums[k++]=1;
            c1--;
        }
        while(c2>0)
        {
            nums[k++]=2;
            c2--;
        }
    }
}