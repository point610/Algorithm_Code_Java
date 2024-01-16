package LeetCode.Easy.MS.MS0306;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName MS0306
 * @Description TODO
 * @Author point
 * @Date 2023/10/10 23:48
 * @Version 1.0
 */
class AnimalShelf {
    Queue<Integer> zero;

    Queue<Integer> one;

    public AnimalShelf() {
        zero = new LinkedList<>();
        one = new LinkedList<>();
    }

    public void enqueue(int[] animal) {
        if (animal[1] == 0) {
            zero.add(animal[0]);
        } else {
            one.add(animal[0]);
        }
    }

    public int[] dequeueAny() {


        if (!zero.isEmpty() && !one.isEmpty()) {
            if (zero.peek() > one.peek()) {
                return new int[]{one.poll(), 1};
            } else {
                return new int[]{zero.poll(), 0};
            }

        }
        if (!zero.isEmpty()) {
            return new int[]{zero.poll(), 0};
        }
        if (!one.isEmpty()) {
            return new int[]{one.poll(), 1};
        }
        return new int[]{-1, -1};
    }

    public int[] dequeueDog() {
        if (one.isEmpty()) {
            return new int[]{-1, -1};
        }
        return new int[]{one.poll(), 1};
    }

    public int[] dequeueCat() {
        if (zero.isEmpty()) {
            return new int[]{-1, -1};
        }
        return new int[]{zero.poll(), 0};
    }
}

public class MS0306 {
}
