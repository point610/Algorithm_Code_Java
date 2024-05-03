package LQB.lqb17122;

import java.util.HashSet;
import java.util.Set;

public class Main {
    private static Set<Integer> oooset = new HashSet<>();
    private static Set<Integer> tttset = new HashSet<>();
    private static boolean[][] list = new boolean[][]{{true, true, false, true, false, true, true, true, true, true}, {true, true, true, false, false, true, true, true, true, false}, {true, true, false, false, true, false, true, true, true, true}, {true, false, true, true, false, true, true, true, true, false}, {true, false, true, false, true, true, true, true, false, false}, {true, false, false, true, false, true, false, true, false, true}, {true, true, true, true, true, true, true, true, true, false}, {false, true, true, true, true, true, true, true, true, false}, {false, true, true, false, true, false, true, true, true, true}, {true, false, true, false, false, true, false, true, false, false}};

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                getone(i, j);
            }
        }
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                gettwo(i, j);
            }
        }

        System.out.println(oooset.size() + tttset.size());
    }

    private static void getone(int x, int y) {
        int step = 1;
        while (x + step < 10 && y + step < 10) {
            if (list[x][y] && list[x][y + step] && list[x + step][y] && list[x + step][y + step]) {
                oooset.add(step);
            }
            step++;
        }
    }

    private static void gettwo(int x, int y) {
        int step = 1;
        while (x + step < 10 && y + step < 10 && x - step >= 0 && y - step >= 0) {
            if (list[x - step][y] && list[x][y + step] && list[x + step][y] && list[x][y - step]) {
                tttset.add(step);
            }
            step++;
        }
    }
}
























