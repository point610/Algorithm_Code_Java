package LeetCode.Middle.LeetCode355;

import java.util.*;

class Twitter {
    private class Node {
        int id;
        int times;

        public Node(int id, int times) {
            this.id = id;
            this.times = times;
        }
    }

    Map<Integer, List<Node>> userpost;
    Map<Integer, Set<Integer>> followee;
    int size;

    public Twitter() {
        userpost = new HashMap<>();
        followee = new HashMap<>();
        size = 0;
    }

    public void postTweet(int userId, int tweetId) {
        if (userpost.containsKey(userId)) {
            userpost.get(userId).add(new Node(tweetId, size++));
        } else {
            userpost.put(userId, new ArrayList<>());
            userpost.get(userId).add(new Node(tweetId, size++));
        }
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList<>();
        List<Node> list = new ArrayList<>();

        Set<Integer> set = followee.get(userId);
        if (set != null) {
            for (Integer integer : set) {
                if (userpost.containsKey(integer)){
                    list.addAll(userpost.get(integer));
                }
            }
        }
        if (userpost.containsKey(userId)){
            list.addAll(userpost.get(userId));
        }

        Collections.sort(list, (a, b) -> b.times - a.times);

        int size = Math.min(10, list.size());
        for (int i = 0; i < size; i++) {
            res.add(list.get(i).id);
        }
        return res;
    }

    public void follow(int followerId, int followeeId) {
        if (followee.containsKey(followerId)) {
            followee.get(followerId).add(followeeId);
        } else {
            followee.put(followerId, new HashSet<>());
            followee.get(followerId).add(followeeId);
        }
    }

    public void unfollow(int followerId, int followeeId) {
        if (followee.containsKey(followerId)) {
            followee.get(followerId).remove(followeeId);
        }
    }
}

public class LeetCode355 {
}
