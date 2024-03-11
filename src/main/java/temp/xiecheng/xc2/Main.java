package temp.xiecheng.xc2;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static Set<String> set;

    public static void main(String[] args) {
        set = new HashSet<>();
        getset();
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
        }
    }

    private static void insertset(char[] one) {
        set.add(String.valueOf(one[0] + one[1] + one[2]));
        set.add(String.valueOf(one[0] + one[2] + one[1]));
        set.add(String.valueOf(one[1] + one[0] + one[2]));
        set.add(String.valueOf(one[1] + one[2] + one[0]));
        set.add(String.valueOf(one[2] + one[1] + one[0]));
        set.add(String.valueOf(one[2] + one[0] + one[1]));
    }

    private static void getset() {
        List<String> list = new ArrayList<>();
        list.add("yoo");

        for (String s : list) {
            insertset(s.toCharArray());
        }
    }
}