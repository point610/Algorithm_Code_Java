package NKW_HW.one.HJ71;


import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String one = scanner.nextLine();
            String two = scanner.nextLine();

            one = one.toLowerCase(Locale.ROOT);
            two = two.toLowerCase(Locale.ROOT);

            String temp = one.replaceAll("\\*{2,}", "\\*");
            temp = temp.replaceAll("\\?", "[0-9a-z]{1}");
            temp = temp.replaceAll("\\*", "[0-9a-z]{0,}");
            System.out.println(two.matches(temp));
        }

    }
}