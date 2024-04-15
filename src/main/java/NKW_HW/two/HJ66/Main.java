package NKW_HW.two.HJ66;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            solution(scanner);
        }
    }

    private static List<Integer> list;
    private static List<List<Integer>> listlist;
    private static List<Character> sign;
    private static List<List<Character>> signlist;

    public static void solution(Scanner scanner) {
        list = new ArrayList<>();
        listlist = new ArrayList<>();
        sign = new ArrayList<>();
        signlist = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(scanner.nextInt());
        }
        listdfs(list, 0);
        initialsign();

        cal();

    }

    private static int cal(List<Integer> one, List<Character> two) {
        int res = one.get(0);
        for (int i = 0; i < two.size(); i++) {
            char cc = two.get(i);
            int oo = res;
            int tt = one.get(i + 1);
            switch (cc) {
                case '+': {
                    res = oo + tt;
                    break;
                }
                case '-': {
                    res = oo - tt;
                    break;
                }
                case '*': {
                    res = oo * tt;
                    break;
                }
                case '/': {
                    if (tt == 0 || oo % tt != 0) {
                        return 0;
                    } else {
                        res = oo / tt;
                    }
                    break;
                }
            }
        }
        return res;
    }

    private static void cal() {
        for (List<Integer> listnumber : listlist) {
            for (List<Character> listsign : signlist) {
                int res = cal(listnumber, listsign);
                if (res == 24) {
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }

    private static void listdfs(List<Integer> temp, int index) {
        if (index == temp.size()) {
            listlist.add(new ArrayList<>(temp));
            return;
        }
        if (index > temp.size()) {
            return;
        }
        for (int i = index; i < temp.size(); i++) {
            int tt = temp.get(i);
            temp.set(i, temp.get(index));
            temp.set(index, tt);

            listdfs(temp, index + 1);

            tt = temp.get(i);
            temp.set(i, temp.get(index));
            temp.set(index, tt);
        }
    }

    private static void initialsign() {
        sign.add('+');
        sign.add('-');
        sign.add('*');
        sign.add('/');
        signdfs(new ArrayList<>());
    }

    private static void signdfs(List<Character> temp) {
        if (temp.size() == 3) {
            signlist.add(new ArrayList<>(temp));
            return;
        }

        for (Character cc : sign) {
            temp.add(cc);

            signdfs(temp);

            temp.remove(temp.size() - 1);
        }

    }
}












