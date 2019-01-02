package problems.stack;

import java.util.Stack;

public class TwoStackQueue {
    private Stack<Integer> in;
    private Stack<Integer> out;
    private int size;

    public TwoStackQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void push(int e) {
        in.push(e);
        size++;
    }

    public int pop() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        size--;
        return out.pop();
    }

    public int peek() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.peek();
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
