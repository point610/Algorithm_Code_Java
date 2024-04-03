package LQB.lqb3500;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Long sum = 0L;  //计算整体求和的
        Long b = 1L;//计算每一步阶乘的和
        for (int i = 1; i >= 0; i++) {
            b *= i;
            b = b % 1000000000L;//只计算每一步计算后9位
            sum += b;//求和所有的后9位的 步
            sum = sum % 1000000000L;//只保留后9位
            if (b % 1000000000L == 0)//如果当该步的后9位全为0 表明 不可能 再变化 因为是乘法
            {
                System.out.println(sum);//输出所有步求和的后9位
                break;
            }

        }
    }
}