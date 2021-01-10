class Solution {
    public int findKthPositive(int[] arr, int k) {
       HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        int count=0,start=1;
        while(count<k)
        {
            if(set.contains(start))
            {
                start++;
            }
            else
            {
                start++;
                count++;
            }
        }
        return start-1;
    }
}