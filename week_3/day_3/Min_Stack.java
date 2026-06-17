class MinStack {

    private static class Node {
        int value;
        int minSoFar;
        Node next;

        Node(int value, int minSoFar, Node next) {
            this.value = value;
            this.minSoFar = minSoFar;
            this.next = next;
        }
    }

    private Node top;

    public MinStack() {
    }

    public void push(int val) {
        if (top == null) {
            top = new Node(val, val, null);
        } else {
            top = new Node(val, Math.min(val, top.minSoFar), top);
        }
    }

    public void pop() {
        top = top.next;
    }

    public int top() {
        return top.value;
    }

    public int getMin() {
        return top.minSoFar;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */