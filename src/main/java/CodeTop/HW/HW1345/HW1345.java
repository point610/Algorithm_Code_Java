package CodeTop.HW.HW1345;

import java.util.*;

class Solution {
    private class Node {
        int index;
        int value;

        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    public int minJumps(int[] arr) {
        int size = arr.length;
        if (size == 1) {
            return 0;
        }

        Map<Integer, List<Node>> valuemap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            int key = arr[i];
            if (valuemap.containsKey(key)) {
                valuemap.get(key).add(new Node(i, arr[i]));
            } else {
                valuemap.put(key, new ArrayList<>());
                valuemap.get(key).add(new Node(i, arr[i]));
            }

            //if (i == 0) {
            //    valuemap.get(key).add(new Node(i + 1, arr[i + 1]));
            //} else if (i == size - 1) {
            //    valuemap.get(key).add(new Node(i - 1, arr[i - 1]));
            //} else {
            //    valuemap.get(key).add(new Node(i + 1, arr[i + 1]));
            //    valuemap.get(key).add(new Node(i - 1, arr[i - 1]));
            //}
        }


        int count = 0;
        // 广度优先搜索
        Queue<Node> queue = new LinkedList<>();
        boolean[] visit = new boolean[size];
        queue.add(valuemap.get(arr[0]).get(0));
        while (!queue.isEmpty()) {
            Queue<Node> qqq = new LinkedList<>();
            count++;
            while (!queue.isEmpty()) {
                Node currentnode = queue.poll();
                int key = currentnode.value;
                int currentindex = currentnode.index;
                if (currentindex == size - 1) {
                    return count - 1;
                }


                if (!visit[currentindex]) {
                    visit[currentindex] = true;

                    //
                    List<Node> templist = valuemap.getOrDefault(key, null);
                    if (templist != null) {
                        for (Node iiiii : templist) {
                            if (!visit[iiiii.index]) {
                                qqq.add(iiiii);
                            }
                        }
                    }

                    // 旁边的node
                    if (currentindex == 0) {
                        if (!visit[currentindex + 1] && arr[currentindex] != arr[currentindex + 1]) {
                            qqq.add(new Node(currentindex + 1, arr[currentindex + 1]));
                        }
                    } else if (currentindex == size - 1) {
                        if (!visit[currentindex - 1] && arr[currentindex] != arr[currentindex - 1]) {
                            qqq.add(new Node(currentindex - 1, arr[currentindex - 1]));
                        }
                    } else {
                        if (!visit[currentindex - 1] && arr[currentindex] != arr[currentindex - 1]) {
                            qqq.add(new Node(currentindex - 1, arr[currentindex - 1]));
                        }
                        if (!visit[currentindex + 1] && arr[currentindex] != arr[currentindex + 1]) {
                            qqq.add(new Node(currentindex + 1, arr[currentindex + 1]));
                        }
                    }

                }
                valuemap.remove(key);
            }
            queue = qqq;
        }
        return 0;
    }
}

public class HW1345 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minJumps(new int[]{100, -23, -23, 404, 100, 23, 23, 23, 3, 404}));
        System.out.println(solution.minJumps(new int[]{7, 6, 9, 6, 9, 6, 9, 7}));
        System.out.println(solution.minJumps(new int[]{7}));
    }
}
