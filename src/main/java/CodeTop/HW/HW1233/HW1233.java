package CodeTop.HW.HW1233;

import java.util.*;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Set<String> set = new HashSet<>();
        Arrays.sort(folder, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        for (String sss : folder) {
            if (set.isEmpty()) {
                set.add(sss);
            } else {
                boolean has = false;
                for (String s : set) {
                    if (sss.indexOf(s) == 0 && sss.charAt(s.length()) == '/') {
                        has = true;
                    }
                }
                if (!has) {
                    set.add(sss);
                }
            }
        }
        List<String> ll = new ArrayList<>();
        for (String s : set) {
            ll.add(s);
        }
        return ll;
    }
}

public class HW1233 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeSubfolders(new String[]{"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"}));
        System.out.println(solution.removeSubfolders(new String[]{"/a", "/a/b/c", "/a/b/d"}));
        System.out.println(solution.removeSubfolders(new String[]{"/a/b/c", "/a/b/ca", "/a/b/d"}));
    }
}
