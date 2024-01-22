package CodeTop.HW.HW306;


import java.math.BigInteger;

class Solution {
    public boolean isAdditiveNumber(String num) {
        int size = num.length();
        // 从第二个累加数字开始
        int twostart;
        int twoend;
        for (twostart = 1; twostart < size - 1; twostart++) {
            // 排除第一个累加数不含前导零
            if (num.charAt(0) == '0' && twostart != 1) {
                break;
            }
            // 计算第二个数的末尾
            for (twoend = twostart; twoend < size - 1; twoend++) {
                // 排除第二个累加数不含前导零
                if (num.charAt(twostart) == '0' && twoend != twostart) {
                    break;
                }
                // 开始回溯
                if (valid(twostart, twoend, num)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean valid(int twostart, int twoend, String num) {
        // 寻找第一个数和第三个数
        int size = num.length();
        int onestart = 0;
        int oneend = twostart - 1;
        while (twoend < size) {
            // 计算第三个数
            // 使用计算得到的第三个数的长度来截取字符串
            String three = sssadd(num.substring(onestart, oneend + 1), num.substring(twostart, twoend + 1));
            int threestart = twoend + 1;
            int threeend = twoend + three.length();
            // 对第三个数进行校验
            if (threeend >= size || !three.equals(num.substring(threestart, threeend + 1))) {
                break;
            }
            if (threeend == size - 1) {
                return true;
            }
            // 移动第一个数和第二个数
            onestart = twostart;
            oneend = twoend;
            twostart = threestart;
            twoend = threeend;
        }
        return false;
    }

    private String sssadd(String one, String two) {
        BigInteger oo = new BigInteger(one);
        BigInteger tt = new BigInteger(two);
        return oo.add(tt).toString();
    }
}

public class HW306 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAdditiveNumber("112358"));
        System.out.println(solution.isAdditiveNumber("199100199"));
    }
}
