class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
       Map<Integer,int[]> map=new HashMap<Integer,int[]>();
        for(int[] piece:pieces)
        {
            map.put(piece[0],piece);
        }
        int res[]=new int[arr.length];
        int ind=0;
        for(int a:arr)
        {
            for(int p:map.get(a))
            {
                res[ind++]=p;
            }
        }
        return Arrays.equals(arr,res);
    }
}