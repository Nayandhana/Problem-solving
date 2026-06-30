class MyStack {
    private Queue<Integer> p;
    public MyStack() {
        p=new LinkedList<>();
    }
    
    public void push(int x) {
        p.add(x);
        for(int i=0;i<p.size()-1;i++)
        p.add(p.poll());
    }
    
    public int pop() {
        return p.poll();
    }
    
    public int top() {
        return p.peek();
    }
    
    public boolean empty() {
        return p.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */