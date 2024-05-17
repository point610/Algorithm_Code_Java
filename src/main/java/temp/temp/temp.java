package temp.temp;


public class temp {
    public static void main(String[] args) {
        int[] list = new int[]{25, 3, 7, 5, 9, 2, 6, 8, 4, 10, 12, 11, 13, 16, 17, 15, 14, 22, 21, 19, 20, 18, 23, 24, 1};
        int[] res = new int[25];
        for (int i = 0; i < 25; i++) {
            res[list[i] - 1] = i + 1;
        }

        for (int i = 0, j = 1; i < 25; j++, i++) {
            System.out.print(res[i]);
            System.out.print(' ');
            if (j % 5 == 0) {
                System.out.println();
            }
        }
    }
}
