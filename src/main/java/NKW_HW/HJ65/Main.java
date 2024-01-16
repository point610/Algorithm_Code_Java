package NKW_HW.HJ65;

    import java.util.Scanner;

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // 注意 hasNext 和 hasNextLine 的区别
            while (scanner.hasNext()) {
                String one = scanner.nextLine();
                String two = scanner.nextLine();
                if (one.length() > two.length()) {
                    String temp = one;
                    one = two;
                    two = temp;
                }
                System.out.println(get(one, two));


            }
        }

        private static String get(String one, String two) {
            int length = one.length();
            int size = one.length();

            while (length >= 0) {
                for (int i = 0; i + length <= size; i++) {
                    String temp = one.substring(i, i + length);
                    if (two.contains(temp)) {
                        return temp;
                    }
                }
                length--;
            }
            return "";

        }
    }