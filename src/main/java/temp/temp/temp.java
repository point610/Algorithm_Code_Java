package temp.temp;

class Soluction {
    public String addStr(StringBuilder one, StringBuilder two) {
        one = one.reverse();
        two = two.reverse();
        StringBuilder res = new StringBuilder();
        int upper = 0;
        int oneindex = 0;
        int twoindex = 0;
        while (oneindex < one.length() && twoindex < two.length()) {
            int oo = one.charAt(oneindex) - '0';
            int tt = two.charAt(twoindex) - '0';
            int temp = oo + tt + upper;
            int current = temp % 10;
            upper = temp / 10;
            res.append(current);
            oneindex++;
            twoindex++;
        }
        while (oneindex < one.length()) {
            int oo = one.charAt(oneindex) - '0';
            int temp = oo + upper;
            int current = temp % 10;
            upper = temp / 10;
            oneindex++;
            res.append(current);
        }
        while (twoindex < two.length()) {
            int tt = two.charAt(twoindex) - '0';
            int temp = tt + upper;
            int current = temp % 10;
            upper = temp / 10;
            twoindex++;
            res.append(current);
        }
        if (upper != 0) {
            res.append(upper);
        }
        return res.reverse().toString();
    }
}

public class temp {
    public static void main(String[] args) {
        Soluction soluction = new Soluction();
        System.out.println(soluction.addStr(new StringBuilder("99999"), new StringBuilder("2")));
        System.out.println(soluction.addStr(new StringBuilder("123456789"), new StringBuilder("2")));
        System.out.println(soluction.addStr(new StringBuilder("19"), new StringBuilder("1")));
        System.out.println(soluction.addStr(new StringBuilder("99"), new StringBuilder("1")));
        System.out.println(soluction.addStr(new StringBuilder("9"), new StringBuilder("1")));
        System.out.println(soluction.addStr(new StringBuilder("0"), new StringBuilder("1")));
        System.out.println(soluction.addStr(new StringBuilder("0"), new StringBuilder("0")));
    }
}
