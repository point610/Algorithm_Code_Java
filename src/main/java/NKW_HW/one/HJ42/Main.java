package NKW_HW.one.HJ42;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static String[] NUMS = {"zero", "xc1", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};

    static String[] NUMSSHI = {"zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    static String[] POWER = {"", "thousand ", "million ", "billion "};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            StringBuilder one = new StringBuilder(scanner.nextLine()).reverse();
            List<StringBuilder> list = new ArrayList<>();
            int index = 0;
            while ((index + 3) <= one.length()) {
                list.add(new StringBuilder(one.substring(index, index + 3)).reverse());
                index = index + 3;
            }
            if (index != one.length()) {
                list.add(new StringBuilder(one.substring(index)).reverse());
            }
            List<String> stringList = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                stringList.add(getStr(String.valueOf(list.get(i))) + POWER[i]);

            }
            for (int i = stringList.size() - 1; i >= 0; i--) {
                System.out.print(stringList.get(i));
            }
        }
    }

    private static String getStr(String one) {

        StringBuilder stringBuilder = new StringBuilder();
        int count = Integer.parseInt(one);

        if (count >= 100) {
            stringBuilder.append(NUMS[count / 100]);
            stringBuilder.append(' ');
            stringBuilder.append("hundred ");
        }
        if (count > 100 && count != 100) {
            stringBuilder.append("and ");
        }
        if (count % 100 <= 20&&count%100!=0) {
            stringBuilder.append(NUMS[count % 100] + " ");
            return stringBuilder.toString();
        }
        int shi = count % 100 / 10;
        int ge = count % 10;
        if (shi != 0 && shi != 1) {
            stringBuilder.append(NUMSSHI[shi]);
            stringBuilder.append(' ');
        }
        if (shi == 1 && ge == 0) {
            stringBuilder.append(NUMSSHI[shi]);
            stringBuilder.append(' ');

        }
        if (ge != 0) {
            stringBuilder.append(NUMS[ge]);
            stringBuilder.append(' ');
        }
        return stringBuilder.toString();

    }
}