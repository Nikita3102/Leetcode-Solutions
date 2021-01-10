class Solution {
    public void rotate(int[][] matrix) {
       int temp,i,j;
        for(i=0;i<matrix.length;i++)
        {
            for(j=i;j<matrix.length;j++)
            {
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<(matrix.length/2);j++)
            {
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }
    }
}