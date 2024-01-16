package LeetCode.Easy.LeetCode1656;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName v
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 14:25
 * @Version 1.0
 */
class OrderedStream {
    int number = 0;

    int index = 0;

    String[] list;

    public OrderedStream(int n) {
        this.number = n;
        list = new String[n];
    }

    public List<String> insert(int idKey, String value) {

        idKey--;
        list[idKey] = value;
        if (idKey == index) {
            List<String> res = new ArrayList<>();
            while (index < number && list[index] != null) {
                res.add(list[index++]);
            }
            return res;
        } else {

            return new ArrayList<>();
        }

    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
public class LeetCode1656 {

}
