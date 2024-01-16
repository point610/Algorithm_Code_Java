package NKW_HW.HJ26;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ss = scanner.nextLine();
        List<Character> stringBuilder = new ArrayList<>();
        for (int i = 0; i < ss.length(); i++) {
            char cc = ss.charAt(i);
            if (Character.isUpperCase(cc) || Character.isLowerCase(cc)) {
                stringBuilder.add(cc);
            }
        }
        Collections.sort(stringBuilder, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return Character.toLowerCase(o1) - Character.toLowerCase(o2);
            }
        });

        for (int i = 0; i < ss.length(); i++) {
            char cc = ss.charAt(i);
            if (Character.isUpperCase(cc) || Character.isLowerCase(cc)) {
            } else {
                stringBuilder.add(i, cc);
            }
        }
        StringBuilder sss=new StringBuilder();
        for (int i = 0; i < stringBuilder.size(); i++) {
            sss.append(stringBuilder.get(i));
        }
        System.out.println(sss);

    }
}