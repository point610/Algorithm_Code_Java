package NKW_HW.two.HJ87;

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

    public static void solution(Scanner scanner) {
        String ss = scanner.nextLine();
        int one = getone(ss);
        int two = gettwo(ss);
        int three = getthree(ss);
        int four = getfour(ss);
        int sum = one + two + three + four;

        //五、奖励（只能选符合最多的那一种奖励）:
        //2 分: 字母和数字
        //3 分: 字母、数字和符号
        //5 分: 大小写字母、数字和符号
        if (two == 20 && three > 0 && four > 0) {
            sum += 5;
        } else if (two == 10 && three > 0 && four > 0) {
            sum += 3;
        } else if (two == 10 && three > 0) {
            sum += 2;
        }
        System.out.println(getlevel(sum));

    }

    public static int getone(String ss) {
        //一、密码长度:
        //5 分: 小于等于4 个字符
        //10 分: 5 到7 字符
        //25 分: 大于等于8 个字符
        int size = ss.length();
        if (size >= 8) {
            return 25;
        } else if (size >= 5) {
            return 10;
        } else {
            return 5;
        }
    }

    public static int gettwo(String ss) {
        //二、字母:
        //0 分: 没有字母
        //10 分: 密码里的字母全都是小（大）写字母
        //20 分: 密码里的字母符合”大小写混合“
        int da = 0;
        int xiao = 0;
        for (int i = 0; i < ss.length(); i++) {
            if (Character.isUpperCase(ss.charAt(i))) {
                da++;
            } else if (Character.isLowerCase(ss.charAt(i))) {
                xiao++;
            }
        }

        if (da == 0 && xiao == 0) {
            return 0;
        } else if (da > 0 && xiao > 0) {
            return 20;
        } else {
            return 10;
        }
    }

    public static int getthree(String ss) {
        //三、数字:
        //0 分: 没有数字
        //10 分: 1 个数字
        //20 分: 大于1 个数字
        int sum = 0;
        for (int i = 0; i < ss.length(); i++) {
            if (Character.isDigit(ss.charAt(i))) {
                sum++;
            }
        }
        if (sum == 0) {
            return 0;
        } else if (sum == 1) {
            return 10;
        } else {
            return 20;
        }

    }

    public static int getfour(String ss) {
        //!"#$%&'()*+,-./     (ASCII码：0x21~0x2F)
        //:;<=>?@             (ASCII码：0x3A~0x40)
        //[\]^_`              (ASCII码：0x5B~0x60)
        //{|}~                (ASCII码：0x7B~0x7E)

        //四、符号:
        //0 分: 没有符号
        //10 分: 1 个符号
        //25 分: 大于1 个符号
        int sum = 0;
        for (int i = 0; i < ss.length(); i++) {
            if ((0x21 <= ss.charAt(i) && ss.charAt(i) <= 0x2F) || (0x3A <= ss.charAt(i) && ss.charAt(i) <= 0x40) || (0x5B <= ss.charAt(i) && ss.charAt(i) <= 0x60) || (0x7B <= ss.charAt(i) && ss.charAt(i) <= 0x7E)) {
                sum++;
            }
        }
        if (sum == 0) {
            return 0;
        } else if (sum == 1) {
            return 10;
        } else {
            return 25;
        }

    }


    public static String getlevel(int level) {
        if (level >= 90) {
            return "VERY_SECURE";
        } else if (level >= 80) {
            return "SECURE";
        } else if (level >= 70) {
            return "VERY_STRONG";
        } else if (level >= 60) {
            return "STRONG";
        } else if (level >= 50) {
            return "AVERAGE";
        } else if (level >= 25) {
            return "WEAK";
        } else {
            return "VERY_WEAK";
        }
    }
}












