package NKW_HW.two.HJ66;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static Map<String, String> all;
    private static Set<String> setone;
    private static Set<String> settwo;

    public static void main(String[] args) {
        all = new HashMap<>();
        setone = new HashSet<>();
        settwo = new HashSet<>();
        initialone(setone);
        initialtwo(settwo);
        initialall(all);
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            solution(scanner);
        }
    }


    public static void solution(Scanner scanner) {
        String[] split = scanner.nextLine().split(" ");
        if (split.length == 1) {
            if ("reset".contains(split[0])) {
                System.out.println("reset what");
            } else {
                System.out.println("unknown command");
            }
            return;
        }
        // reset board	          board fault
        // board add	        where to add
        // board delete      	no board at all
        // reboot backplane	      impossible
        // backplane abort	      install first
        Set<String> one = new HashSet<>();
        Set<String> two = new HashSet<>();

        for (String ss : setone) {
            if (ss.startsWith(split[0])) {
                one.add(ss);
            }
        }
        for (String ss : settwo) {
            if (ss.startsWith(split[1])) {
                two.add(ss);
            }
        }
        if (one.isEmpty() || two.isEmpty()) {
            System.out.println("unknown command");
        } else {
            List<String> list = new ArrayList<>();
            for (String oo : one) {
                for (String tt : two) {
                    if (all.containsKey(oo + " " + tt)) {
                        list.add(all.get(oo + " " + tt));
                    }
                }
            }
            if (list.size() == 1) {
                System.out.println(list.get(0));
            } else {
                System.out.println("unknown command");
            }
        }
    }

    private static void initialone(Set<String> set) {
        set.add("reset");
        set.add("board");
        set.add("reboot");
        set.add("backplane");
    }

    private static void initialall(Map<String, String> all) {
        // reset board	          board fault
        // board add	        where to add
        // board delete      	no board at all
        // reboot backplane	      impossible
        // backplane abort	      install first
        all.put("reset board", "board fault");
        all.put("board add", "where to add");
        all.put("board delete", "no board at all");
        all.put("reboot backplane", "impossible");
        all.put("backplane abort", "install first");

    }

    private static void initialtwo(Set<String> set) {
        set.add("board");
        set.add("add");
        set.add("delete");
        set.add("backplane");
        set.add("abort");
    }

}












