package LeetCode.Easy.LeetCode2451;


/**
 * @ClassName LeetCode2451
 * @Description TODO
 * @Author point
 * @Date 2023/10/2 10:57
 * @Version 1.0
 */
class Solution {
    boolean issame(int[] a, int[] b) {
        int size = a.length;
        for (int i = 0; i < size; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public String oddString(String[] words) {

        int size = words.length;
        int column = words[0].length() - 1;
        int[][] arr = new int[size][column];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < words[i].length() - 1; j++) {
                arr[i][j] = (words[i].charAt(j + 1) - 'a') - (words[i].charAt(j) - 'a');
            }
        }

        int[] current = new int[column];
        if (issame(arr[0], arr[1])) {
            current = arr[0];
        }
        if (issame(arr[0], arr[2])) {
            current = arr[0];
        }
        if (issame(arr[1], arr[2])) {
            current = arr[1];
        }
        for (int i = 0; i < size; i++) {
            if (!issame(current, arr[i])) {
                return words[i];
            }
        }
        return "";
    }
}

public class LeetCode2451 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.oddString(new String[]{"nnnmmmnnmmmmmmmmmmnm", "iiihhhiihhhhhhhhhhih", "aaaabbbbbbaaabaaaabb", "qqqpppqqppppppppppqp", "eeedddeedddddddddded", "eeedddeedddddddddded", "iiihhhiihhhhhhhhhhih", "lllkkkllkkkkkkkkkklk", "sssrrrssrrrrrrrrrrsr", "sssrrrssrrrrrrrrrrsr", "jjjiiijjiiiiiiiiiiji", "nnnmmmnnmmmmmmmmmmnm", "xxxwwwxxwwwwwwwwwwxw", "eeedddeedddddddddded", "zzzyyyzzyyyyyyyyyyzy", "wwwvvvwwvvvvvvvvvvwv", "cccbbbccbbbbbbbbbbcb", "xxxwwwxxwwwwwwwwwwxw", "cccbbbccbbbbbbbbbbcb", "yyyxxxyyxxxxxxxxxxyx", "hhhggghhgggggggggghg"});
    }
}
