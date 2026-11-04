class MinStack {
    private final Deque<Integer> values = new ArrayDeque<>();
    private final Deque<Integer>mins=new ArrayDeque<>();
    public void push(int val)
    {
        values.push(val);
        if(mins.isEmpty() || val<=mins.peek())
        {
            mins.push(val);
        }
    }
    public void pop() {
        if(values.pop().equals(mins.peek()))
        {
            mins.pop();
        }
    }
    public int top()
    {
        return values.peek();
    }
    public int getMin()
    {
        return mins.peek();
    }
}