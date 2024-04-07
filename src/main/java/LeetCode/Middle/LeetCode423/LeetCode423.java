package LeetCode.Middle.LeetCode423;

class Solution {
    public String originalDigits(String s) {

        int[] map = new int[26];
        int[] count = new int[10];
        for (int c : s.toCharArray()) {
            ++map[c - 'a'];
        }

        int z = map['z' - 'a'];
        map['z' - 'a'] -= z;
        map['e' - 'a'] -= z;
        map['r' - 'a'] -= z;
        map['o' - 'a'] -= z;
        count[0] = z;

        int w = map['w' - 'a'];
        map['t' - 'a'] -= w;
        map['w' - 'a'] -= w;
        map['o' - 'a'] -= w;
        count[2] = w;

        int u = map['u' - 'a'];
        map['f' - 'a'] -= u;
        map['o' - 'a'] -= u;
        map['u' - 'a'] -= u;
        map['r' - 'a'] -= u;
        count[4] = u;

        int x = map['x' - 'a'];
        map['s' - 'a'] -= x;
        map['i' - 'a'] -= x;
        map['x' - 'a'] -= x;
        count[6] = x;

        int f = map['f' - 'a'];
        map['f' - 'a'] -= f;
        map['i' - 'a'] -= f;
        map['v' - 'a'] -= f;
        map['e' - 'a'] -= f;
        count[5] = f;

        int r = map['r' - 'a'];
        map['t' - 'a'] -= r;
        map['h' - 'a'] -= r;
        map['r' - 'a'] -= r;
        map['e' - 'a'] -= r;
        map['e' - 'a'] -= r;
        count[3] = r;

        int o = map['o' - 'a'];
        map['o' - 'a'] -= o;
        map['n' - 'a'] -= o;
        map['e' - 'a'] -= o;
        count[1] = o;

        int v = map['v' - 'a'];
        map['s' - 'a'] -= v;
        map['e' - 'a'] -= v;
        map['v' - 'a'] -= v;
        map['n' - 'a'] -= v;
        map['e' - 'a'] -= v;
        count[7] = v;

        int t = map['t' - 'a'];
        map['e' - 'a'] -= t;
        map['i' - 'a'] -= t;
        map['g' - 'a'] -= t;
        map['h' - 'a'] -= t;
        map['t' - 'a'] -= t;
        count[8] = t;

        int e = map['e' - 'a'];
//        map['n' - 'a'] -= e;
//        map['n' - 'a'] -= e;
//        map['n' - 'a'] -= e;
//        map['n' - 'a'] -= e;
        count[9] = e;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < count[i]; ++j) {
                sb.append(i);
            }
        }
        return sb.toString();
    }
}

public class LeetCode423 {
}
