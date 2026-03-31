import java.util.*;

class MinStack {

    Stack<Integer> st;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        
        for(int x : st){
            if(x < min){
                min = x;
            }
        }
        
        return min;
    }
}