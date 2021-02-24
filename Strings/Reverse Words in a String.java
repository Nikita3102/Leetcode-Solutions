class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        int left=0,right=arr.length-1;
        String temp;
        while(left<right)
        {
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return String.join(" ",arr);
    }
}