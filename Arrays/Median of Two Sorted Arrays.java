class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int result[]=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        double median;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                result[k++]=nums1[i++];
            }
            else
            {
                result[k++]=nums2[j++];
            }
        }
        while(i<nums1.length)
        {
            result[k++]=nums1[i++];
        }
        while(j<nums2.length)
        {
            result[k++]=nums2[j++];
        }
        if(k%2!=0)
        {
            median=result[k/2];
        }
        else
        {   
            median=((double)result[k/2]+(double)result[k/2 - 1])/2;
        }
        return median;
    }
}