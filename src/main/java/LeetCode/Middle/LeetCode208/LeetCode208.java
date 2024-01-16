package LeetCode.Middle.LeetCode208;

/**
 * @ClassName LeetCode208
 * @Description TODO
 * @Author point
 * @Date 2023/11/17 22:37
 * @Version 1.0
 */
class Trie {
    private Trie[] childNode;

    private boolean end;

    public Trie() {
        childNode = new Trie[26];
        end = false;
    }

    public void insert(String word) {
        Trie node = this;
        int size = word.length();
        for (int i = 0; i < size; i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (node.childNode[index] == null) {
                node.childNode[index] = new Trie();
            }

            node = node.childNode[index];
        }
        node.end = true;
    }


    public boolean search(String word) {
        Trie node = this;
        int size = word.length();
        for (int i = 0; i < size; i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (node.childNode[index] == null) {
                return false;
            }
            node = node.childNode[index];
        }
        return node != null && node.end;

    }

    public boolean startsWith(String prefix) {
        Trie node = this;
        int size = prefix.length();
        for (int i = 0; i < size; i++) {
            char c = prefix.charAt(i);
            int index = c - 'a';
            if (node.childNode[index] == null) {
                return false;
            }
            node = node.childNode[index];
        }
        return node != null;
    }

}

public class LeetCode208 {
}
