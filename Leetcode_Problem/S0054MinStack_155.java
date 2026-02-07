// Date: 07-02-2026
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class MinStack {
    Node top;
    Node minTop;

    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;

        if (minTop == null || val <= minTop.val) {
            Node minNode = new Node(val);
            minNode.next = minTop;
            minTop = minNode;
        }
    }

    public void pop() {
        if (top == null) return;

        if (top.val == minTop.val) {
            minTop = minTop.next;
        }
        top = top.next;
    }

    public int top() {
        return top == null ? -1 : top.val;
    }

    public int getMin() {
        return minTop == null ? -1 : minTop.val;
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