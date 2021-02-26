class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int start=0,end=0;
        if(D>weights.length)
        {
            return -1;
        }
        for(int i=0;i<weights.length;i++)
        {
            end+=weights[i];
            if(start<weights[i])
            {
                start=weights[i];
            }
        }
        int res=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(isValid(weights,D,mid)==true)
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
    
    public boolean isValid(int weights[],int D,int cap)
    {
        int s=1,sum=0;
        for(int i=0;i<weights.length;i++)
        {
            sum+=weights[i];
            if(sum>cap)
            {
                s++;
                sum=weights[i];
            }
            if(s>D)
            {
                return false;
            }
        }
        return true;  
    }
}