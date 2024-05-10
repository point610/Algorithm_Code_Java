package LeetCode.Middle.LeetCode649;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> Radiant = new LinkedList<>();
        Queue<Integer> Dire = new LinkedList<>();
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                Radiant.add(i);
            } else {
                Dire.add(i);
            }
        }

        while (!Radiant.isEmpty() && !Dire.isEmpty()) {
            int one = Radiant.poll();
            int two = Dire.poll();
            if (one > two) {
                Dire.add(two + senate.length());
            } else {
                Radiant.add(one + senate.length());
            }
        }
        if (!Radiant.isEmpty()) {
            return "Radiant";
        } else {
            return "Dire";
        }

    }
}

public class LeetCode649 {
}
