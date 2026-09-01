class MinStack {
    Stack<Integer> st;
    Stack<Integer> st1;
    public MinStack() {
       st=new Stack<>();
     st1= new Stack<>();
   
    }
    
    public void push(int val) {
        st.push(val);
        if(st1.empty()){
            st1.push(val);

        }
        else{
        int x=Math.min(st.peek(),st1.peek());
        st1.push(x);
        }
    }
    
    public void pop() {
        st.pop();
        st1.pop();
    }
    
    public int top() {
       return st.peek();
    }
    
    public int getMin() {
       return st1.peek();
    }
}
