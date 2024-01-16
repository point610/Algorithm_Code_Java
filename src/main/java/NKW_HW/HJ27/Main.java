package NKW_HW.HJ27;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {

    static boolean same(char[] one, char[] two) {
        return new String(one).equals(new String(two));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            String[] split = scanner.nextLine().split(" ");
            int size = split.length;
            int number = Integer.parseInt(split[0]);
            List<char[]> list = new ArrayList<>();
            for (int i = 1; i <= number; i++) {
                list.add(split[i].toCharArray());
                Arrays.sort(list.get(i - 1));
            }
            char[] cc = split[size - 2].toCharArray();
            int index = Integer.parseInt(split[size - 1]);
            Arrays.sort(cc);
            List<String> stringList = new ArrayList<>();

            for (int i = 0; i < number; i++) {
                if (same(list.get(i), cc) && !split[size - 2].equals(split[i + 1])) {
                    stringList.add(split[i + 1]);
                }
            }

            System.out.println(stringList.size());
            Collections.sort(stringList);
            if (!(index>stringList.size())){
                System.out.println(stringList.get(index - 1));
            }
        }
    }
}