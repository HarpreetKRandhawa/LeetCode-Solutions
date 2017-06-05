class Node{
    
    int num;
    int min;
    Node next;
    
    Node(int x){
        num = x;
        min = x;
        next = null;
    }
}
public class MinStack {
    
    Node top;
    
    public void push(int x) {
        if(top == null)
            top = new Node(x);
        else{
            Node temp = new Node(x);
            temp.next = top;
            temp.min = Math.min(top.min,x);
            top = temp;
        }
    }
    
    public void pop() {
        top = top.next;
    }
    
    public int top() {
        if(top == null)
            return Integer.MAX_VALUE;
        return top.num;
    }
    
    public int getMin() {
        if(top == null)
            return Integer.MAX_VALUE;
        return top.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
