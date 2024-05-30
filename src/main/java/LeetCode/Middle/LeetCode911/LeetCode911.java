package LeetCode.Middle.LeetCode911;

import javax.sound.midi.Soundbank;
import java.util.*;

class TopVotedCandidate {

    private TreeMap<Integer, Integer> time2number;

    private class Node {
        int index;
        int value;
        int time;

        public Node(int index, int value, int time) {
            this.index = index;
            this.value = value;
            this.time = time;
        }
    }

    public TopVotedCandidate(int[] persons, int[] times) {
        time2number = new TreeMap<>();

        Set<Integer> set = new HashSet<>();
        for (int temp : persons) {
            set.add(temp);
        }
        Map<Integer, Node> indexgetNode = new HashMap<>();
        List<Node> list = new ArrayList<>();
        for (int i = 0; i < set.size(); i++) {
            Node temp = new Node(i, 0, 0);
            list.add(temp);
            indexgetNode.put(i, temp);
        }

        for (int i = 0; i < persons.length; i++) {
            int tt = times[i];
            int pp = persons[i];
            Node node = indexgetNode.get(pp);
            node.value++;
            node.time = tt;
            Collections.sort(list, (a, b) -> {
                if (a.value == b.value) {
                    return b.time - a.time;
                }
                return b.value - a.value;
            });
            time2number.put(tt, list.get(0).index);
        }
    }

    public int q(int t) {
        return time2number.get(time2number.floorKey(t));
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */
public class LeetCode911 {
    public static void main(String[] args) {
        TopVotedCandidate topvotedcandidate = new TopVotedCandidate(new int[]{0, 1, 1, 0, 0, 1, 0}, new int[]{0, 5, 10, 15, 20, 25, 30});

        System.out.println(topvotedcandidate.q(3));

        System.out.println(topvotedcandidate.q(12));

        System.out.println(topvotedcandidate.q(25));

        System.out.println(topvotedcandidate.q(15));

        System.out.println(topvotedcandidate.q(24));

        System.out.println(topvotedcandidate.q(8));

    }
}
