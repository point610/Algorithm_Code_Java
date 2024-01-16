package NKW_HW.HJ87;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        String sign = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        Scanner scanner = new Scanner(System.in);
        String ss = scanner.nextLine();
        int size = ss.length();
        int sum = 0;
        //一、密码长度:
        // 5 分: 小于等于4 个字符
        // 10 分: 5 到7 字符
        // 25 分: 大于等于8 个字符
        //
        if (size >= 8) {
            sum += 25;
        } else if (size >= 5) {
            sum += 10;
        } else {
            sum += 5;
        }
        int zimu = 0;
        int daxie = 0;
        int xiaoxie = 0;
        int shuzi = 0;
        int fuhao = 0;
        for (int i = 0; i < size; i++) {
            if ('A' <= ss.charAt(i) && ss.charAt(i) <= 'Z') {
                daxie++;
                zimu++;
            } else if ('a' <= ss.charAt(i) && ss.charAt(i) <= 'z') {
                xiaoxie++;
                zimu++;
            }
            if ('0' <= ss.charAt(i) && ss.charAt(i) <= '9') {
                shuzi++;
            }
            if (sign.indexOf(ss.charAt(i)) != -1) {
                fuhao++;
            }
        }
        // 二、字母:
        // 0 分: 没有字母
        // 10 分: 密码里的字母全都是小（大）写字母
        // 20 分: 密码里的字母符合”大小写混合“
        if (zimu == 0) {

        } else if (daxie != 0 && xiaoxie != 0) {
            sum += 20;
        } else {
            sum += 10;
        }

        // 三、数字:
        // 0 分: 没有数字
        // 10 分: 1 个数字
        // 20 分: 大于1 个数字
        if (shuzi == 0) {

        } else if (shuzi == 1) {
            sum += 10;
        } else {
            sum += 20;
        }

        // 四、符号:
        // 0 分: 没有符号
        // 10 分: 1 个符号
        // 25 分: 大于1 个符号
        if (fuhao == 0) {

        } else if (fuhao == 1) {
            sum += 10;
        } else {
            sum += 25;
        }
        // 五、奖励（只能选符合最多的那一种奖励）:
        // 2 分: 字母和数字
        // 3 分: 字母、数字和符号
        // 5 分: 大小写字母、数字和符号
        if (daxie != 0 && xiaoxie != 0 && shuzi != 0 && fuhao != 0) {
            sum += 5;
        } else if (zimu != 0 && shuzi != 0 && fuhao != 0) {
            sum += 3;
        } else if (shuzi != 0 && fuhao != 0) {
            sum += 2;
        }
        //最后的评分标准:
        // >= 90: 非常安全
        // >= 80: 安全（Secure）
        // >= 70: 非常强
        // >= 60: 强（Strong）
        // >= 50: 一般（Average）
        // >= 25: 弱（Weak）
        // >= 0:  非常弱（Very_Weak）
        if (sum >= 90) {
            System.out.println("VERY_SECURE");
        } else if (sum >= 80) {
            System.out.println("SECURE");
        } else if (sum >= 70) {
            System.out.println("VERY_STRONG");
        } else if (sum >= 60) {
            System.out.println("STRONG");
        } else if (sum >= 50) {
            System.out.println("AVERAGE");
        } else if (sum >= 25) {
            System.out.println("WEAK");
        } else if (sum >= 0) {
            System.out.println("VERY_WEAK");
        }

        // 对应输出为：
        //
        // VERY_SECURE
        // SECURE
        // VERY_STRONG
        // STRONG
        // AVERAGE
        // WEAK
        // VERY_WEAK
    }
}