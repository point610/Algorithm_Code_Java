package LeetCode.Middle.LeetCode211;


class WordDictionary {
    private Trie root;

    public WordDictionary() {
        root = new Trie();

    }

    public void addWord(String word) {
        root.insert(word);
    }

    public boolean search(String word) {
        return dfs(word, 0, root);

    }

    public boolean dfs(String word, int index, Trie trie) {
        if (index == word.length()) {
            return trie.isEnd;
        }
        char cc = word.charAt(index);
        if (cc == '.') {
            for (int i = 0; i < 26; i++) {
                Trie child = trie.childs[i];
                if (child != null && dfs(word, index + 1, child)) {
                    return true;
                }
            }
        } else {
            int tempindx = cc - 'a';
            Trie child = trie.childs[tempindx];
            if (child != null && dfs(word, index + 1, child)) {
                return true;
            }
        }
        return false;
    }

    class Trie {
        private Trie[] childs;
        private boolean isEnd;

        public Trie() {
            this.childs = new Trie[26];
            this.isEnd = false;
        }

        public void insert(String word) {
            Trie node = this;
            int size = word.length();
            for (int i = 0; i < size; i++) {
                char cc = word.charAt(i);
                int index = cc - 'a';
                if (node.childs[index] == null) {
                    node.childs[index] = new Trie();
                }
                // ndoe向下移动
                node = node.childs[index];
            }
            node.isEnd = true;
        }
    }

}

public class LeetCode211 {
}













