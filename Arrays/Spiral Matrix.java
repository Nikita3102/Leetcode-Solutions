class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList();
        int top=0,bottom=matrix.length-1,left=0,right=matrix[0].length-1,d=0;
        while(left<=right && top<=bottom)
        {
            if(d==0)
            {
                for(int i=left;i<=right;i++)
                {
                    list.add(matrix[top][i]);
                }
                top++;
                d=1;
            }
            else if(d==1)
            {
                for(int i=top;i<=bottom;i++)
                {
                    list.add(matrix[i][right]);
                }
                right--;
                d=2;
            }
            else if(d==2)
            {
                for(int i=right;i>=left;i--)
                {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
                d=3;
            }
            else if(d==3)
            {
                for(int i=bottom;i>=top;i--)
                {
                    list.add(matrix[i][left]);
                }
                left++;
                d=0;
            }
        }
        return list;
    }
}