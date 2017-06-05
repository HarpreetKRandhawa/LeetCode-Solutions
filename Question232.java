public class MyQueue {

    Stack<Integer> temp = new Stack<Integer>();
    Stack<Integer> val = new Stack<Integer>();
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(val.isEmpty())
            val.push(x);
        else{
            while(!val.isEmpty()){
                temp.push(val.pop());
            }
            val.push(x);
            while(!temp.isEmpty()){
                val.push(temp.pop());
            }
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return val.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return val.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return val.isEmpty();
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
