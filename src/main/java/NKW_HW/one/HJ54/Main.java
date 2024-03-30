package NKW_HW.one.HJ54;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static Set<Character> sign;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sign = new HashSet<>();
        sign.add('+');
        sign.add('-');
        sign.add('*');
        sign.add('/');

        String ss = scanner.nextLine();
        int index = 0;
        Stack<Integer> nnss = new Stack<>();
        Stack<Character> ccss = new Stack<>();
        int size = ss.length();
        while (index < size) {
            char cc = ss.charAt(index);
            if (issifgn(cc)) {
                ccss.add(cc);
                index++;
            } else if (cc == '(') {
                ccss.add(cc);
                index++;
            } else if (cc == ')') {
                Stack<Integer> tempnnss = new Stack<>();
                Stack<Character> tempccss = new Stack<>();
                tempnnss.add(nnss.pop());
                while (ccss.peek() != '(') {
                    tempccss.add(ccss.pop());
                    tempnnss.add(nnss.pop());
                }

                ccss.pop();

                while (!tempccss.isEmpty()) {
                    switch (tempccss.pop()) {
                        case '+': {
                            int one = tempnnss.pop();
                            int two = tempnnss.pop();
                            tempnnss.add(one + two);
                            break;
                        }
                        case '-': {
                            int one = tempnnss.pop();
                            int two = tempnnss.pop();
                            tempnnss.add(one - two);
                            break;
                        }
                    }
                }
                nnss.add(tempnnss.pop());

                if (!ccss.isEmpty() && (ccss.peek() == '/' || ccss.peek() == '*')) {
                    switch (ccss.pop()) {
                        case '*': {
                            int one = nnss.pop();
                            int two = nnss.pop();
                            nnss.add(one * two);
                            break;
                        }
                        case '/': {
                            int one = nnss.pop();
                            int two = nnss.pop();
                            nnss.add(two / one);
                            break;
                        }
                    }

                }
                index++;

            } else {

                // 数字
                int next = index + 1;
                while (next < ss.length() && isnumber(ss.charAt(next))) {
                    next++;
                }
                int number = Integer.parseInt(ss.substring(index, next));
                index = next;
                // 开始计算
                if (nnss.isEmpty()) {
                    nnss.add(number);
                } else {
                    if (ccss.peek() == '(' || ccss.peek() == '+' || ccss.peek() == '-') {
                        nnss.add(number);
                    } else {
                        switch (ccss.pop()) {
                            case '*': {
                                int one = nnss.pop();
                                int two = number;
                                nnss.add(one * two);
                                break;
                            }
                            case '/': {
                                int one = nnss.pop();
                                int two = number;
                                nnss.add(two / one);
                                break;
                            }
                        }

                    }

                }

            }

        }
        Collections.reverse(ccss);
        Collections.reverse(nnss);
        while (!ccss.isEmpty()) {
            switch (ccss.pop()) {
                case '+': {
                    int one = nnss.pop();
                    int two = nnss.pop();
                    nnss.add(one + two);
                    break;
                }
                case '-': {
                    int one = nnss.pop();
                    int two = nnss.pop();
                    nnss.add(one - two);
                    break;
                }
            }
        }
        System.out.println(nnss.peek());
    }

    private static boolean issifgn(char cc) {
        return sign.contains(cc);
    }

    private static boolean isnumber(char cc) {
        return '0' <= cc && cc <= '9';
    }
}