package LeetCode.Easy.LCR041;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName LCR041
 * @Description TODO
 * @Author point
 * @Date 2023/10/7 22:00
 * @Version 1.0
 */
class MovingAverage {

    Queue<Integer> queue = new LinkedList<>();

    int sum = 0;

    int currentsize = 0;

    int size = 0;

    public MovingAverage(int size) {
        this.size = size;
    }

    public double next(int val) {
        if (currentsize == size) {

            sum -= queue.poll();
            queue.add(val);
            sum+=val;

            return sum * 1.0 / currentsize;
        } else {
            currentsize++;
            queue.add(val);
            sum += val;
            return sum * 1.0 / currentsize;
        }
    }

}

public class LCR041 {
}
