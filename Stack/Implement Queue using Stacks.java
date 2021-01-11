class MyQueue {
    Stack<Integer> old_stack;
    Stack<Integer> new_stack;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        old_stack=new Stack<>();
        new_stack=new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        new_stack.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        shiftStacks();
        return old_stack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        shiftStacks();
        return old_stack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return old_stack.isEmpty() && new_stack.isEmpty();
    }
    
    void shiftStacks()
    {
        if(old_stack.isEmpty())
        {
            while(!new_stack.isEmpty())
            {
                old_stack.push(new_stack.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */