package temp.hw.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            soluction(scanner);
        }
    }

    private static void soluction(Scanner scanner) {
        int size = scanner.nextInt();
        List<String> list = new ArrayList<>();
        scanner.nextLine();
        String[] split = scanner.nextLine().split(" ");
        for (int i = 0; i < size; i++) {
            list.add(split[i]);
        }
        while (list.size() >= 3) {

            int index = getindex(list);
            if (index == -1) {
                break;
            }
            list.remove(index);
            list.remove(index);
            list.remove(index);
        }
        print(list);
    }

    private static void print(List<String> list) {
        if (list.isEmpty()) {
            System.out.print(0);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print(" ");
            }
        }
    }

    private static int getindex(List<String> list) {
        for (int i = 0; i < list.size() - 2; i++) {
            if (list.get(i).equals(list.get(i + 1)) && list.get(i).equals(list.get(i + 2))) {
                return i;
            }
        }
        return -1;
    }
}























