package CodeTop.TX.TX622;

class MyCircularQueue {
    private int capacity;
    private int[] arr;
    private int head;
    private int end;
    private int size;

    public MyCircularQueue(int k) {
        this.capacity = k;
        arr = new int[capacity];
        head = 0;
        end = 0;
        size = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        arr[end] = value;
        end = (end + 1) % capacity;
        size++;

        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        head = (head + 1) % capacity;
        size--;

        return true;
    }

    public int Front() {
        if (size == 0) {
            return -1;
        }
        return arr[head];
    }

    public int Rear() {
        if (size == 0) {
            return -1;
        }

        return arr[(end - 1 + capacity) % capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}

public class TX622 {
}
