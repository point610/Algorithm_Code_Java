package CodeTop.HW.HW622;

class MyCircularQueue {
    private int size;
    private int allsize;
    private int[] ll;
    private int head;
    private int end;

    public MyCircularQueue(int k) {

        size = 0;
        allsize = k;
        ll = new int[k];
        head = 0;
        end = 0;

    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        ll[end] = value;
        end = (end + 1) % allsize;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        size--;
        head = (head + 1) % allsize;
        return true;
    }

    public int Front() {
        if (size == 0) {
            return -1;
        }
        return ll[head];
    }

    public int Rear() {
        if (size == 0) {
            return -1;
        }
        return ll[(end - 1 + allsize) % allsize];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == allsize;
    }
}

public class HW622 {
}
