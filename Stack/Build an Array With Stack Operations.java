class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list=new ArrayList();
        int i=0;
        int j=0;
        while(i<=n && j<target.length)
        {
            if(target[j]==i+1)
            {
                list.add("Push");
                j++;
            }
            else
            {
                list.add("Push");
                list.add("Pop");
            }
            i++;
        }
        return list;
    }
}