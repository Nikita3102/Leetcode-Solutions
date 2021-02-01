for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      if(mat[i][j]==0)
      {
        for(int k=0;k<c;k++)
        {
          if(mat[i][k]!=0)
            mat[i][k]=-1;
        }
        for(int k=0;k<r;k++)
        {
          if(mat[k][j]!=0)
            mat[k][j]=-1;
        }
      }
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      if(mat[i][j]==-1)
        mat[i][j]=0;
    }
  }