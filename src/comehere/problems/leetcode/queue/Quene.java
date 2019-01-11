package comehere.problems.leetcode.queue;

public class Quene {

    private final int initialSize = 10;
    private int front;
    private int rear;
    private int[] array;

    public Quene(int size) {
        rear = -1;
        front = 0;
        if (size == 0) {
            array = new int[initialSize + 1];
        } else {
            array = new int[size + 1];
        }
    }

    public boolean enquene(int element) {
        //队满
        if ((rear + 2) % array.length == front) {
            return false;
        }

        //因为实指,需要先移动到下一个空位
        rear = (rear + 1) % array.length;
        array[rear] = element;
        return true;
    }

    public boolean dequene() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % array.length;
        return true;
    }

    public boolean isEmpty() {
        return (rear + 1) % array.length == front;
    }

}
