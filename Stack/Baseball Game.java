class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();
        int sum=0;
        for(int i=0;i<ops.length;i++)
        {
            if(ops[i].equals("+"))
            {
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b);
                stack.push(a);
                stack.push(a+b);
                sum=sum+a+b;
            }
            else
            if(ops[i].equals("D"))
            {
                int c=stack.peek();
                stack.push(c*2);
                sum=sum+(c*2);
            }
            else
            if(ops[i].equals("C"))
            {
                int d=stack.pop();
                sum=sum-d;
            }
            else
            {
                int num=Integer.valueOf(ops[i]);
                stack.push(num);
                sum=sum+num;
            }
        }
        
        return sum;
    }
}