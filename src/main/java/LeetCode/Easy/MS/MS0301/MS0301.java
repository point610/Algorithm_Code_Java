package LeetCode.Easy.MS.MS0301;

/**
 * @ClassName MS0301
 * @Description TODO
 * @Author point
 * @Date 2023/10/10 23:32
 * @Version 1.0
 */

class TripleInOne {
    int size;

    int[] arr;

    int one;

    int two;

    int three;

    public TripleInOne(int stackSize) {
        arr = new int[3 * stackSize];
        size = stackSize;
        one = 0;
        two = 0;
        three = 0;
    }

    public void push(int stackNum, int value) {
        switch (stackNum) {
            case 0: {
                if (one == size) {
                    return;
                }
                arr[one++] = value;
                break;
            }
            case 1: {
                if (two == size) {
                    return;
                }
                arr[size + two++] = value;
                break;
            }
            case 2: {
                if (three == size) {
                    return;
                }
                arr[size +size +  three++] = value;
                break;
            }
        }
    }

    public int pop(int stackNum) {
        switch (stackNum) {
            case 0: {
                if (one == 0) {
                    return -1;
                }
                return arr[--one];
            }
            case 1: {
                if (two == 0) {
                    return -1;
                }
                return arr[size + --two];
            }
            case 2: {
                if (three == 0) {
                    return -1;
                }
                return arr[size + size + --three];
            }
        }
        return -1;
    }

    public int peek(int stackNum) {
        switch (stackNum) {
            case 0: {
                if (one == 0) {
                    return -1;
                }
                return arr[one - 1];
            }
            case 1: {
                if (two == 0) {
                    return -1;
                }
                return arr[size + two - 1];
            }
            case 2: {
                if (three == 0) {
                    return -1;
                }
                return arr[size + size + three - 1];
            }
        }
        return -1;
    }

    public boolean isEmpty(int stackNum) {
        switch (stackNum) {
            case 0: {
                if (one == 0) {
                    return true;
                }
                return false;
            }
            case 1: {
                if (two == 0) {
                    return true;
                }
                return false;
            }
            case 2: {
                if (three == 0) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}

public class MS0301 {
}
