package interview.xc240313.xc1;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String ss = scanner.nextLine();
            //you
            int y = 0;
            int o = 0;
            int u = 0;
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < ss.length(); i++) {
                switch (ss.charAt(i)) {
                    case 'y': {
                        y++;
                        break;
                    }
                    case 'o': {
                        o++;
                        break;
                    }
                    case 'u': {
                        u++;
                        break;
                    }
                    default: {
                        stringBuilder.append(ss.charAt(i));
                    }
                }
            }
            int times = y;
            times = Math.min(times, o);
            times = Math.min(times, u);

            y -= times;
            o -= times;
            u -= times;

            for (int i = 0; i < times; i++) {
                stringBuilder.append("you");
            }
            for (int i = 0; i < y; i++) {
                stringBuilder.append('y');
            }
            for (int i = 0; i < o; i++) {
                stringBuilder.append('o');
            }
            for (int i = 0; i < u; i++) {
                stringBuilder.append('u');
            }

            System.out.println(stringBuilder);

        }
}