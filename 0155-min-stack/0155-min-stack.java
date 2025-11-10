class MinStack {
    Stack<Integer> min;
    Stack<Integer> min2;
    public MinStack() {
        min= new Stack<>();
        min2= new Stack<>();
    }
    
    public void push(int val) {
        if (min2.isEmpty()) min2.push(val);
        else if (val<=min2.peek()){
            min2.push(val);
        }
        min.push(val);
    }
    
    public void pop() {
        
        if (!min.isEmpty()) {
            int val= min.peek();
             min.pop();
            if (!min2.isEmpty() && min2.peek()==val){
                min2.pop();
            }
        }
    }
    
    public int top() {
        return min.peek();
    }
    
    public int getMin() {
        return min2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */