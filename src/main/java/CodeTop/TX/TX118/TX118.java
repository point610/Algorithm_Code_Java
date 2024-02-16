package CodeTop.TX.TX118;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            if (i == 0) {
                temp.add(1);
                list.add(temp);
            } else if (i == 1) {
                temp.add(1);
                temp.add(1);
                list.add(temp);
            } else {
                temp.add(1);
                // 加入中间的
                int lastindex = i - 1;
                for (int j = 1; j < i; j++) {
                    temp.add(list.get(lastindex).get(j - 1) + list.get(lastindex).get(j));
                }
                temp.add(1);
                list.add(temp);
            }
        }
        return list;
    }
}

public class TX118 {
}
