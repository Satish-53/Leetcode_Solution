class MyQueue {
    private Stack<Integer>input=new Stack<>();
    private Stack<Integer>output=new Stack<>();
    public MyQueue() {}
    public void push(int x)
    {
        input.push(x);
    }
    public int pop()
    {
        moveIfNeeded();
        return output.pop();
    }
    public int peek()
    {
        moveIfNeeded();
        return output.peek();
    }
    public boolean empty()
    {
        return input.empty() && output.empty();
    }
    private void moveIfNeeded()
    {
        if(output.empty()) 
        {
            while(!input.empty())
            {
                output.push(input.pop());
            }
        }
    }
}