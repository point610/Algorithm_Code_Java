package NKW_HW.one.HJ45;
import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            int size = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < size; i++) {
                System.out.println(getPL(scanner.nextLine()));
            }
        }
    }

    private static int getPL(String one) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character cc : one.toCharArray()) {
            map.put(cc, map.getOrDefault(cc, 0) + 1);

        }
        List<Integer> list = new ArrayList<>();
        for (Character key : map.keySet()) {
            list.add(map.get(key));

        }
        Collections.sort(list);
        int size = list.size();
        int index = 26;
        int sum = 0;
        for (int i = size - 1; i >= 0; i--) {
            sum += (index * list.get(i));
            index--;
        }
        return sum;

    }
}