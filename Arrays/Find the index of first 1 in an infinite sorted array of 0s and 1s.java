/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		System.out.println(firstOne(arr));
	}
	public static int firstOne(int arr[])
	{
	    int low=0,high=1,mid=0;
	    while(arr[high]==0)
	    {
	        low=high;
	        high=high*2;
	    }
	    while(low<=high)
	    {
	        mid=low+(high-low)/2;
	        if(arr[mid]==1 && (mid==0 || arr[mid-1]==0))
	        {
	            break;
	        }
	        else if(arr[mid]==1)
	        {
	            high=mid-1;
	        }
	        else
	        {
	            low=mid+1;
	        }
	    }
        return mid; 
	}
}